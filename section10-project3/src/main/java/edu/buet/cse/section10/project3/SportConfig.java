package edu.buet.cse.section10.project3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

  @Bean
  public FortuneService happyFortuneService() {
    return new HappyFortuneService();
  }

  @Bean
  public Coach swimCoach() {
    return new SwimCoach(happyFortuneService());
  }
}
