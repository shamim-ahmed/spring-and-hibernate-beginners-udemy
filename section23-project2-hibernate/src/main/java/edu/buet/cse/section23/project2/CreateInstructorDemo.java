package edu.buet.cse.section23.project2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.buet.cse.section23.project2.model.Instructor;
import edu.buet.cse.section23.project2.model.InstructorDetail;

public class CreateInstructorDemo {

  public static void main(String... args) {
    SessionFactory sessionFactory =
        new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
            .addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
    Session session = sessionFactory.getCurrentSession();
    
    try {
      Transaction transaction = session.beginTransaction();
      Instructor instructor = new Instructor("John", "Smith", "jsmith@gmail.com");
      InstructorDetail instructorDetail = new InstructorDetail("https://www.youtube.com", "Philately");
      instructor.setInstructorDetail(instructorDetail);
      
      session.save(instructor);
      transaction.commit();
    } finally {
      session.close();
      sessionFactory.close();
    }
  }
}
