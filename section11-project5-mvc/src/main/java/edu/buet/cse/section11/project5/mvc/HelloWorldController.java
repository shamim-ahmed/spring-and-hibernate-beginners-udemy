package edu.buet.cse.section11.project5.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

  @RequestMapping("/showForm")
  public String showForm() {
    return "helloWorld-form";
  }

  @RequestMapping("/processForm")
  public String processForm(@RequestParam String studentName, ModelMap modelMap) {
    String convertedName = studentName != null ? studentName.toUpperCase() : null;
    String result = "Yo! " + convertedName;
    modelMap.addAttribute("message", result);

    return "helloWorld";
  }
}
