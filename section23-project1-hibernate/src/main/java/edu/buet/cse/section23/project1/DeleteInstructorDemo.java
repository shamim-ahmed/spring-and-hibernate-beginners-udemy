package edu.buet.cse.section23.project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section23.project1.model.Instructor;
import edu.buet.cse.section23.project1.model.InstructorDetail;

public class DeleteInstructorDemo {

  public static void main(String... args) {
    SessionFactory sessionFactory =
        new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
            .addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();
    final long id = 1L;

    try {
      Transaction transaction = session.beginTransaction();
      Instructor instructor = session.get(Instructor.class, id);

      session.remove(instructor);
      transaction.commit();
    } finally {
      session.close();
      sessionFactory.close();
    }
  }
}
