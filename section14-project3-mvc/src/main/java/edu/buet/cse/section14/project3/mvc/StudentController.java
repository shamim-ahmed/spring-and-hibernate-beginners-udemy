package edu.buet.cse.section14.project3.mvc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

  private final List<String> countryList =
      Collections.unmodifiableList(Arrays.asList("Bangladesh", "Nepal", "Bhutan", "Sri Lanka"));

  private final Logger logger = LogManager.getLogger(getClass());

  @RequestMapping("/showForm")
  public String showForm(Model model) {
    Student student = new Student();
    model.addAttribute("student", student);
    model.addAttribute("countryOptions", countryList);

    return "student-form";
  }

  @RequestMapping("/processForm")
  public String processForm(@ModelAttribute("student") Student student) {
    logger.info("Student info: " + student);

    return "student-confirmation";
  }
}
