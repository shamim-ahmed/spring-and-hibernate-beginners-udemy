package edu.buet.cse.section24.project2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section24.project2.model.Course;
import edu.buet.cse.section24.project2.model.Instructor;

public class CreateInstructorDemo {

  public static void main(String... args) {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Instructor.class).addAnnotatedClass(Course.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    try {
      Transaction transaction = session.beginTransaction();
      Instructor instructor = new Instructor("John", "Smith", "jsmith@gmail.com");
      session.save(instructor);
      transaction.commit();
      
      System.out.println(instructor);
    } catch (Exception ex) {
      System.err.println(ex);
    } finally {
      session.close();
      sessionFactory.close();
    }
  }
}
