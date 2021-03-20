package edu.buet.cse.section20.project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section20.project1.model.Student;

public class ReadStudentDemo {

  public static void main(String... args) {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Student.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    try {
      Transaction transaction = session.beginTransaction();
      Student student = new Student("Arild", "Olsen", "arild@gmail.com");
      session.save(student);
      Long id = student.getId();

      // look up the Student object from Session using id
      Student tempStudent = session.find(Student.class, id);
      System.out.println(tempStudent);

      transaction.commit();
    } finally {
      session.close();
      sessionFactory.close();
    }
  }
}
