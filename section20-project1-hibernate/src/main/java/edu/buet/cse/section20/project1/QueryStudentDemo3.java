package edu.buet.cse.section20.project1;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section20.project1.model.Student;

public class QueryStudentDemo3 {

  public static void main(String... args) {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Student.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    try {
      Transaction transaction = session.beginTransaction();
      Query query = session
          .createQuery("from Student s where s.firstName = :firstName and s.lastName = :lastName");
      query.setParameter("firstName", "John");
      query.setParameter("lastName", "Doe");

      @SuppressWarnings("unchecked")
      List<Student> resultList = query.getResultList();

      for (Student student : resultList) {
        System.out.println(student);
      }

      transaction.commit();
    } finally {
      session.close();
      sessionFactory.close();
    }
  }
}
