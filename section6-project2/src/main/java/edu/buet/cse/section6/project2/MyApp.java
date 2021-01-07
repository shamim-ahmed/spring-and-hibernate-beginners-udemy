package edu.buet.cse.section6.project2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve the bean
    Coach trCoach = appContext.getBean("trCoach", Coach.class);
    System.out.println(trCoach.getDailyWorkout());
    System.out.println(trCoach.getDailyFortune());

    // close the context
    appContext.close();
  }
}
