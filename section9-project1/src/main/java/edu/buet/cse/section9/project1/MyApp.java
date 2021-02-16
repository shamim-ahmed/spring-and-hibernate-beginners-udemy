package edu.buet.cse.section9.project1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve the bean
    Coach tennisCoach = appContext.getBean("myTennisCoach", Coach.class);
    Coach alphaCoach = appContext.getBean("myTennisCoach", Coach.class);
    
    System.out.println(tennisCoach == alphaCoach);
    System.out.println(tennisCoach);
    System.out.println(alphaCoach);

    // close the context
    appContext.close();
  }
}
