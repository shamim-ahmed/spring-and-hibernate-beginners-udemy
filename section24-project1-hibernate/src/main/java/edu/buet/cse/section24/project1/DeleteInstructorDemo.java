package edu.buet.cse.section24.project1;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section24.project1.model.Course;
import edu.buet.cse.section24.project1.model.Instructor;

public class DeleteInstructorDemo {

  public static void main(String... args) {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Instructor.class).addAnnotatedClass(Course.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    try {
      Transaction transaction = session.beginTransaction();
      Query query = session.createQuery("from Instructor i where i.email = :email");
      query.setParameter("email", "jsmith@gmail.com");
      @SuppressWarnings("unchecked")
      List<Instructor> resultList = query.getResultList();

      if (resultList.size() > 0) {
        Instructor instructor = resultList.get(0);

        // avoid foreign key constraint failure
        for (Course course : instructor.getCourses()) {
          course.setInstructor(null);
          session.save(course);
        }

        session.remove(instructor);
      }

      transaction.commit();
    } catch (Exception ex) {
      System.err.println(ex);
    } finally {
      session.close();
      sessionFactory.close();
    }
  }
}
