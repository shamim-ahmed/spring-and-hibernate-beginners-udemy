package edu.buet.cse.section5.project3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create the application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve spring bean
    Coach myCoach = appContext.getBean("myCoach", Coach.class);
    System.out.println(myCoach.getDailyWorkout());
    System.out.println(myCoach.getDailyFortune());

    // close the context
    appContext.close();
  }
}
