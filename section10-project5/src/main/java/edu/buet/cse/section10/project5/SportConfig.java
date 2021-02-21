package edu.buet.cse.section10.project5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:edu/buet/cse/section10/project5/swim.properties")
public class SportConfig {

  @Bean
  public FortuneService sadFortuneService() {
    return new SadFortuneService();
  }

  @Bean
  public Coach swimCoach() {
    return new SwimCoach(sadFortuneService());
  }
}
