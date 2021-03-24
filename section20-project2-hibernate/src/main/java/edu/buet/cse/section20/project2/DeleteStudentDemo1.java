package edu.buet.cse.section20.project2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section20.project2.model.Student;

public class DeleteStudentDemo1 {

  public static void main(String... args) {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Student.class).buildSessionFactory();
    Session session1 = null;
    Session session2 = null;

    try {

      // create a new student
      session1 = sessionFactory.getCurrentSession();
      Transaction transaction1 = session1.beginTransaction();
      Student student1 = new Student("Jim", "Henry", "jim@gmail.com");
      session1.save(student1);
      transaction1.commit();

      // obtain student id
      System.out.println(student1);
      final long id = student1.getId();

      // delete the student object just created
      session2 = sessionFactory.getCurrentSession();
      Transaction transaction2 = session2.beginTransaction();
      Student student2 = session2.find(Student.class, id);
      session2.delete(student2);
      transaction2.commit();
    } finally {
      if (session1 != null) {
        session1.close();
      }

      if (session2 != null) {
        session2.close();
      }

      sessionFactory.close();
    }
  }
}
