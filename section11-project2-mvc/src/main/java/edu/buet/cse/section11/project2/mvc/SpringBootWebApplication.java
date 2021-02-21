package edu.buet.cse.section11.project2.mvc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootWebApplication {
  private static final Logger logger = LogManager.getLogger(SpringBootWebApplication.class);

  public static void main(String... args) {
    ApplicationContext appContext = SpringApplication.run(SpringBootWebApplication.class, args);
    String[] beanNames = appContext.getBeanDefinitionNames();

    for (String name : beanNames) {
      logger.info("Bean name: " + name);
    }
  }
}
