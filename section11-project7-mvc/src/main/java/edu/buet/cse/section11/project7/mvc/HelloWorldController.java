package edu.buet.cse.section11.project7.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

  @RequestMapping("/showForm")
  public String showForm() {
    return "helloWorld-form";
  }

  // note the object we use for transferring the result from controller to view
  @RequestMapping("/processForm")
  public String processForm(@RequestParam String studentName, Model model) {
    String convertedName = studentName != null ? studentName.toUpperCase() : null;
    String result = "Yo! " + convertedName;
    model.addAttribute("message", result);

    return "helloWorld";
  }
}
