package edu.buet.cse.section10.project1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    AnnotationConfigApplicationContext appContext =
        new AnnotationConfigApplicationContext(SportConfig.class);

    // retrieve the bean
    Coach tennisCoach = appContext.getBean("myTennisCoach", Coach.class);
    System.out.println(tennisCoach.getDailyWorkout());
    System.out.println(tennisCoach.getDailyFortune());

    // close the context
    appContext.close();
  }
}
