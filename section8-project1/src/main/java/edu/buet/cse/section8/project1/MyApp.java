package edu.buet.cse.section8.project1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve the bean
    Coach coach = appContext.getBean(Coach.class);
    System.out.println(coach.getDailyWorkout());
    System.out.println(coach.getDailyFortune());

    // close the context
    appContext.close();
  }
}
