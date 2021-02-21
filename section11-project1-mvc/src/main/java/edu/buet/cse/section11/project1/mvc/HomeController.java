package edu.buet.cse.section11.project1.mvc;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  
  @RequestMapping("/")
  public String index(HttpServletResponse response) {
    response.setContentType("text/plain");
    return "Hello world";
  }
}
