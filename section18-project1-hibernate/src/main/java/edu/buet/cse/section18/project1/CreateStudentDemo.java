package edu.buet.cse.section18.project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section18.project1.model.Student;

public class CreateStudentDemo {

  public static void main(String... args) {
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Student.class).buildSessionFactory();
    Session session = factory.getCurrentSession();

    try {
      Student student = new Student("John", "Smith", "john@yahoo.com");

      Transaction transaction = session.beginTransaction();
      session.save(student);
      transaction.commit();
      
      System.out.println("Persisted object : " + student);
    } finally {
      session.close();
      factory.close();
    }
  }
}
