package edu.buet.cse.section10.project5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    AnnotationConfigApplicationContext appContext =
        new AnnotationConfigApplicationContext(SportConfig.class);

    // retrieve the bean
    SwimCoach swimCoach = appContext.getBean("swimCoach", SwimCoach.class);
    System.out.println(swimCoach.getDailyWorkout());
    System.out.println(swimCoach.getDailyFortune());
    System.out.printf("The email address for team '%s' is %s%n", swimCoach.getTeam(), swimCoach.getEmail());

    // close the context
    appContext.close();
  }
}
