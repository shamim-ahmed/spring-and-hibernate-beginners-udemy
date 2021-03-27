package edu.buet.cse.section23.project2;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section23.project2.model.Instructor;
import edu.buet.cse.section23.project2.model.InstructorDetail;

public class DeleteInstructorDetailDemo {

  public static void main(String... args) {
    SessionFactory sessionFactory =
        new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
            .addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    try {
      Transaction transaction = session.beginTransaction();
      Query query = session.createQuery("from InstructorDetail d where d.hobby = :hobby");
      query.setParameter("hobby", "Philately");
      @SuppressWarnings("unchecked")
      List<InstructorDetail> resultList = query.getResultList();

      for (InstructorDetail detail : resultList) {
        session.remove(detail);
      }

      transaction.commit();
    } finally {
      session.close();
      sessionFactory.close();
    }
  }
}
