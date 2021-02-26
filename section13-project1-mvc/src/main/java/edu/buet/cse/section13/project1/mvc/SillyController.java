package edu.buet.cse.section13.project1.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class SillyController {

  @RequestMapping("/showForm")
  public String showTheForm() {
    return "silly";
  }
}
