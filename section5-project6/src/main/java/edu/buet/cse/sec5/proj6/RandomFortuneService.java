package edu.buet.cse.sec5.proj6;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
  private static final String[] MESSAGE_ARRAY = {"Beware of the wolf in sheep's clothing",
      "Diligence is the mother of good luck", "The journey is the reward"};

  @Override
  public String getFortune() {
    Random randomGenerator = new Random();
    int index = randomGenerator.nextInt(MESSAGE_ARRAY.length);
    return MESSAGE_ARRAY[index];
  }
}
