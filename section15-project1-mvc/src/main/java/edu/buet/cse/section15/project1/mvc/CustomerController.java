package edu.buet.cse.section15.project1.mvc;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

  private final Logger logger = LogManager.getLogger(getClass());

  @InitBinder
  public void initBinder(DataBinder dataBinder) {
    StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
    dataBinder.registerCustomEditor(String.class, trimmerEditor);
  }

  @RequestMapping("/showForm")
  public String showForm(ModelMap modelMap) {
    Customer customer = new Customer();
    modelMap.addAttribute("customer", customer);

    return "customer-form";
  }

  @RequestMapping("/processForm")
  public String processForm(@Valid @ModelAttribute("customer") Customer customer,
      BindingResult bindingResult) {
    logger.info("Customer details : " + customer);

    if (bindingResult.hasErrors()) {
      return "customer-form";
    }

    return "customer-confirmation";
  }
}
