package edu.buet.cse.section11.project6.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

  @RequestMapping("/showForm")
  public String showForm() {
    return "helloWorld-form";
  }

  // note the objects we use to read request parameter value and transfer result to view
  @RequestMapping("/processForm")
  public String processForm(HttpServletRequest request, Model model) {
    String studentName = request.getParameter("studentName");
    String convertedName = studentName != null ? studentName.toUpperCase() : null;
    String result = "Yo! " + convertedName;
    model.addAttribute("message", result);

    return "helloWorld";
  }
}
