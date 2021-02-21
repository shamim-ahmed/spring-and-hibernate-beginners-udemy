package edu.buet.cse.section11.project1.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootWebApplication {

  public static void main(String... args) {
    ApplicationContext appContext = SpringApplication.run(SpringBootWebApplication.class, args);
    String[] beanNames = appContext.getBeanDefinitionNames();

    for (String name : beanNames) {
      System.out.println(name);
    }
  }
}
