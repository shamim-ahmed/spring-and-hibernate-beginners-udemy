package edu.buet.cse.section24.project2;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section24.project2.model.Course;
import edu.buet.cse.section24.project2.model.Instructor;

public class DeleteCourseDemo {

  public static void main(String... args) {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Instructor.class).addAnnotatedClass(Course.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    try {
      Transaction transaction = session.beginTransaction();
      Query query = session.createQuery("from Course c where c.title = :title");
      query.setParameter("title", "Italian Cuisine");
      @SuppressWarnings("unchecked")
      List<Course> courseList = query.getResultList();

      if (courseList.size() > 0) {
        Course course = courseList.get(0);
        session.delete(course);
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
