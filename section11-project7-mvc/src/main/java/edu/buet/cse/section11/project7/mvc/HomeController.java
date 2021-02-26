package edu.buet.cse.section11.project7.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String welcome(ModelMap modelMap) {
    return "welcome";
  }
}
