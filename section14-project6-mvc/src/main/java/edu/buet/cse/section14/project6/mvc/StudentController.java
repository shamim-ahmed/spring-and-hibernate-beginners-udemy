package edu.buet.cse.section14.project6.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

  private final Logger logger = LogManager.getLogger(getClass());
  
  private final String[] languageNames = {"Java", "Python", "C#", "Ruby"};

  @Value("#{countryOptions}")
  private Map<String, String> countryMap;

  @RequestMapping("/showForm")
  public String showForm(Model model) {
    Student student = new Student();
    model.addAttribute("student", student);
    model.addAttribute("countryMap", countryMap);
    
    // initialize languageMap and add it as an attribute
    Map<String, String> languageMap = new LinkedHashMap<>();
    
    for (String lang : languageNames) {
      languageMap.put(lang, lang);
    }
    
    model.addAttribute("languageMap", languageMap);

    return "student-form";
  }

  @RequestMapping("/processForm")
  public String processForm(@ModelAttribute("student") Student student) {
    logger.info("Student info: " + student);

    return "student-confirmation";
  }
}
