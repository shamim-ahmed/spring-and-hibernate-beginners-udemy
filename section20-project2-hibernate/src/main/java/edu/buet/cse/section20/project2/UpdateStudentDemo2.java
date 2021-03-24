package edu.buet.cse.section20.project2;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section20.project2.model.Student;

public class UpdateStudentDemo2 {

  public static void main(String... args) {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Student.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();
    final long primaryKey = 1L;

    try {
      Transaction transaction = session.beginTransaction();

      // update the student record
      Query query = session.createQuery("update Student s set s.email = :email where s.id = :id");
      query.setParameter("email", "dooby@yahoo.com");
      query.setParameter("id", primaryKey);
      query.executeUpdate();

      // print the updated data
      Student student = session.get(Student.class, primaryKey);
      System.out.println(student);

      transaction.commit();
    } finally {
      session.close();
      sessionFactory.close();
    }
  }
}
