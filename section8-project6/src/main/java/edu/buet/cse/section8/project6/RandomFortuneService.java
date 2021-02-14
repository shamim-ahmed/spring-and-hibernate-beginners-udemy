package edu.buet.cse.section8.project6;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

  // create an array of strings
  private String[] data = {"Beware of the wolf in sheep's clothing",
      "Diligence is the mother of good luck", "The journey is the reward"};

  @Override
  public String getFortune() {
    Random randomGenerator = new Random();
    int idx = randomGenerator.nextInt(data.length);
    return data[idx];
  }
}
