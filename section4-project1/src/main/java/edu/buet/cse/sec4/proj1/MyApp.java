package edu.buet.cse.sec4.proj1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("/edu/buet/cse/sec4/proj1/applicationContext.xml");
    Coach myCoach = appContext.getBean("myCoach", Coach.class);
    System.out.println(myCoach.getDailyWorkout());
    appContext.close();
  }
}
