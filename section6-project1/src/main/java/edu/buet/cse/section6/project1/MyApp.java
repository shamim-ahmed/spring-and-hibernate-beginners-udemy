package edu.buet.cse.section6.project1;

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
    Coach trCoach1 = appContext.getBean("trCoach", Coach.class);
    Coach trCoach2 = appContext.getBean("trCoach", Coach.class);
    System.out.println("Same object? " + (trCoach1 == trCoach2));

    // close the context
    appContext.close();
  }
}
