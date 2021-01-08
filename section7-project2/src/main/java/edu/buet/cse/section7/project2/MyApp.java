package edu.buet.cse.section7.project2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve the bean
    Coach trCoach = appContext.getBean("trackCoach", Coach.class);
    System.out.println(trCoach.getDailyWorkout());

    // close the context
    appContext.close();
  }
}
