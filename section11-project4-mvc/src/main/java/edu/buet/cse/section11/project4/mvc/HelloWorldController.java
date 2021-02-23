package edu.buet.cse.section11.project4.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

  @RequestMapping("/showForm")
  public String showForm() {
    return "helloWorld-form";
  }

  @RequestMapping("/processForm")
  public String processForm() {
    return "helloWorld";
  }
}
