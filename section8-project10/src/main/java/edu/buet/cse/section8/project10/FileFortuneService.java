package edu.buet.cse.section8.project10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

  private String[] data;

  public FileFortuneService() {
    List<String> myList = new ArrayList<>();

    try (Scanner scanner = new Scanner(
        getClass().getResourceAsStream("/edu/buet/cse/section8/project10/fortune-data.txt"))) {

      while (scanner.hasNextLine()) {
        myList.add(scanner.nextLine());
      }
    }

    data = myList.toArray(new String[0]);
  }

  @Override
  public String getFortune() {
    if (data.length == 0) {
      return null;
    }

    Random randomGenerator = new Random();
    int idx = randomGenerator.nextInt(data.length);
    return data[idx];
  }
}
