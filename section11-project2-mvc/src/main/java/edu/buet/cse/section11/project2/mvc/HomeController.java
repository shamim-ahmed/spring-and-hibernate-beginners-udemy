package edu.buet.cse.section11.project2.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
  
  @RequestMapping("/")
  public String index() {
    return "index.jsp";
  }
};
