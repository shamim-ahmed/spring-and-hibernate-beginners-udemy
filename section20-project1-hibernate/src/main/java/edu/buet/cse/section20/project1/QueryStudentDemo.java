package edu.buet.cse.section20.project1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section20.project1.model.Student;

public class QueryStudentDemo {

  public static void main(String... args) {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Student.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();

    try {
      Transaction transaction = session.beginTransaction();
      @SuppressWarnings("unchecked")
      List<Student> resultList = session.createQuery("from Student").getResultList();

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
