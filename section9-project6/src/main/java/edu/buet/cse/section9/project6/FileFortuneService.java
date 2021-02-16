package edu.buet.cse.section9.project6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

  @Value("${file.name}")
  private String fileName;
  private String[] data;

  @PostConstruct
  public void doCustomInit() {
    System.out.printf("Reading data from %s%n", fileName);

    List<String> myList = new ArrayList<>();

    try (Scanner scanner = new Scanner(getClass().getResourceAsStream("/" + fileName))) {
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
