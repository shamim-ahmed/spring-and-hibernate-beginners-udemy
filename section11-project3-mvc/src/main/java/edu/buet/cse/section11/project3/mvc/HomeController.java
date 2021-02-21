package edu.buet.cse.section11.project3.mvc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.buet.cse.section11.project3.mvc.model.Book;

@Controller
public class HomeController {
  private final List<Book> favoriteBooks =
      Collections.unmodifiableList(Arrays.asList(new Book("Effective Java", "Joshua Bloch"),
          new Book("Beginning Java 7", "Ivor Horton")));

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String welcome(ModelMap modelMap) {
    modelMap.addAttribute("bookList", favoriteBooks);
    return "welcome";
  }
}
