package edu.buet.cse.section7.project3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve the beans
    Coach trCoach = appContext.getBean("trackCoach", Coach.class);
    System.out.println(trCoach.getDailyWorkout());

    Coach tennisCoach = appContext.getBean("myTennisCoach", Coach.class);
    System.out.println(tennisCoach.getDailyWorkout());

    // close the context
    appContext.close();
  }
}
