package edu.buet.cse.section10.project6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

  public static void main(String... args) {
    AnnotationConfigApplicationContext appContext =
        new AnnotationConfigApplicationContext(SportConfig.class);
    Coach wrestlingCoach = appContext.getBean("wrestlingCoach", Coach.class);
    System.out.println(wrestlingCoach.getDailyWorkout());
    System.out.println(wrestlingCoach.getDailyFortune());
    appContext.close();
  }
}
