package edu.buet.cse.sec5.proj2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

  public static void main(String... args) {
    // create application context
    ClassPathXmlApplicationContext appContext =
        new ClassPathXmlApplicationContext("/edu/buet/cse/sec5/proj2/applicationContext.xml");

    // retrieve the beans
    Coach bbCoach = appContext.getBean("bbCoach", Coach.class);
    System.out.println(bbCoach.getDailyWorkout());
    System.out.println(bbCoach.getDailyFortune());

    Coach trCoach = appContext.getBean(TrackCoach.class);
    System.out.println(trCoach.getDailyWorkout());
    System.out.println(trCoach.getDailyFortune());

    // close the context
    appContext.close();
  }
}
