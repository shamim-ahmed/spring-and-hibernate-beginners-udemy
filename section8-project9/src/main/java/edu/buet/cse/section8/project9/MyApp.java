package edu.buet.cse.section8.project9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve the bean
    SwimCoach swimCoach = appContext.getBean(SwimCoach.class);
    System.out.println(swimCoach.getDailyWorkout());
    System.out.println(swimCoach.getDailyFortune());
    System.out.println(swimCoach.getEmail());
    System.out.println(swimCoach.getTeam());

    // close the context
    appContext.close();
  }
}
