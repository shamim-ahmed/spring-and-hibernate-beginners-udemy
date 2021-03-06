package edu.buet.cse.section4.project2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve the beans
    Coach bbCoach = appContext.getBean("bbCoach", Coach.class);
    System.out.println(bbCoach.getDailyWorkout());

    Coach soccerCoach = appContext.getBean(SoccerCoach.class);
    System.out.println(soccerCoach.getDailyWorkout());

    // close the context
    appContext.close();
  }
}
