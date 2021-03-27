package edu.buet.cse.section23.project3;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section23.project3.model.Instructor;
import edu.buet.cse.section23.project3.model.InstructorDetail;

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
        // detach the instructor from the detail
        Instructor instructor = detail.getInstructor();
        instructor.setInstructorDetail(null);

        // remove the detail
        session.remove(detail);
      }

      transaction.commit();
    } catch (Exception ex) {
      System.err.println("Error: " + ex);
    } finally {
      session.close();
      sessionFactory.close();
    }
  }
}
