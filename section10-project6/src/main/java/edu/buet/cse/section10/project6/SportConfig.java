package edu.buet.cse.section10.project6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

  @Bean
  public FortuneService happyFortuneService() {
    return new HappyFortuneService();
  }

  @Bean
  public Coach wrestlingCoach() {
    return new WrestlingCoach(happyFortuneService());
  }
}
