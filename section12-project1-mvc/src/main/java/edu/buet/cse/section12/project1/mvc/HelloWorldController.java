package edu.buet.cse.section12.project1.mvc;

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
