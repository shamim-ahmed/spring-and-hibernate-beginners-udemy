package edu.buet.cse.section10.project3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    AnnotationConfigApplicationContext appContext =
        new AnnotationConfigApplicationContext(SportConfig.class);

    // retrieve the bean
    Coach swimCoach = appContext.getBean("swimCoach", Coach.class);
    System.out.println(swimCoach.getDailyWorkout());
    System.out.println(swimCoach.getDailyFortune());

    // close the context
    appContext.close();
  }
}
