package edu.buet.cse.sec5.proj4;

public class HappyFortuneService implements FortuneService {

  @Override
  public String getFortune() {
    return "Today is your lucky day!";
  }
}