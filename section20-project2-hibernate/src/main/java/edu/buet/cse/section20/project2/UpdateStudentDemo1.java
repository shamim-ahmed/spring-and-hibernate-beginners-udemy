package edu.buet.cse.section20.project2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section20.project2.model.Student;

public class UpdateStudentDemo1 {

  public static void main(String... args) {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Student.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();
    final long id = 1L;

    try {
      Transaction transaction = session.beginTransaction();

      // fetch the student object and print it
      Student student = session.get(Student.class, id);
      System.out.println("Before update: " + student);

      // update the student object
      student.setFirstName("Scooby");
      student.setLastName("Dooby");
      student.setEmail("scooby@gmail.com");
      session.update(student);

      // fetch and print the updated student object
      Student updatedStudent = session.get(Student.class, id);
      System.out.println("After update: " + updatedStudent);

      transaction.commit();
    } finally {
      session.close();
      sessionFactory.close();
    }
  }
}
