package edu.buet.cse.section23.project3;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section23.project3.model.Instructor;
import edu.buet.cse.section23.project3.model.InstructorDetail;

public class DeleteInstructorDemo {

  public static void main(String... args) {
    SessionFactory sessionFactory =
        new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
            .addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    try {
      Transaction transaction = session.beginTransaction();
      Query query = session.createQuery("from Instructor i where i.email = :email");
      query.setParameter("email", "jsmith@gmail.com");
      @SuppressWarnings("unchecked")
      List<Instructor> resultList = query.getResultList();

      for (Instructor instructor : resultList) {
        session.remove(instructor);
      }

      transaction.commit();
    } finally {
      session.close();
      sessionFactory.close();
    }
  }
}
