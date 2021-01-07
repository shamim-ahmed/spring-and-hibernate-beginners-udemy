package edu.buet.cse.section6.project4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve the singleton bean
    Coach bbCoach1 = appContext.getBean("bbCoach", Coach.class);
    Coach bbCoach2 = appContext.getBean("bbCoach", Coach.class);
    System.out.println("Same object? " + (bbCoach1 == bbCoach2));

    // retrieve the prototype bean
    Coach soccerCoach1 = appContext.getBean("soccerCoach", Coach.class);
    Coach soccerCoach2 = appContext.getBean("soccerCoach", Coach.class);
    System.out.println("Same object? " + (soccerCoach1 == soccerCoach2));

    // close the context
    appContext.close();
  }
}
