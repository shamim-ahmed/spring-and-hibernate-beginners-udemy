package edu.buet.cse.section8.project8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve the bean
    Coach tennisCoach = appContext.getBean("myTennisCoach", Coach.class);
    System.out.println(tennisCoach.getDailyWorkout());
    System.out.println(tennisCoach.getDailyFortune());

    // close the context
    appContext.close();
  }
}
