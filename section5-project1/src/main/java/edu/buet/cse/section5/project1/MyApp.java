package edu.buet.cse.section5.project1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve the beans
    Coach myCoach = appContext.getBean("myCoach", Coach.class);
    System.out.println(myCoach.getDailyWorkout());
    System.out.println(myCoach.getDailyFortune());

    // close the context
    appContext.close();
  }
}
