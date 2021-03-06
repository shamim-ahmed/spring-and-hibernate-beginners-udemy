package edu.buet.cse.section5.project5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create the application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve spring bean
    CricketCoach myCoach = appContext.getBean("myCoach", CricketCoach.class);
    System.out.println(myCoach.getDailyWorkout());
    System.out.println(myCoach.getDailyFortune());
    System.out.println(myCoach.getEmailAddress());
    System.out.println(myCoach.getTeam());

    // close the context
    appContext.close();
  }
}
