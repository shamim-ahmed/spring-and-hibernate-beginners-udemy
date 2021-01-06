package edu.buet.cse.sec5.proj1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("/edu/buet/cse/sec5/proj1/applicationContext.xml");

    // retrieve the beans
    Coach myCoach = appContext.getBean("myCoach", Coach.class);
    System.out.println(myCoach.getDailyWorkout());
    System.out.println(myCoach.getDailyFortune());

    // close the context
    appContext.close();
  }
}
