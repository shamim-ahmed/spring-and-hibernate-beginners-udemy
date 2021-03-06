package edu.buet.cse.section4.project1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    Coach myCoach = appContext.getBean("myCoach", Coach.class);
    System.out.println(myCoach.getDailyWorkout());
    appContext.close();
  }
}
