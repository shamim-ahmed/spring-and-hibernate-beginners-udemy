package edu.buet.cse.section11.project1.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @RequestMapping(path = "/", method = RequestMethod.GET, produces = "text/plain")
  public String index() {
    return "Hello world";
  }
}
