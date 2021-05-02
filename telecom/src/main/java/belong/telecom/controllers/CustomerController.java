package belong.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import belong.telecom.interfaces.ICustomer;
import belong.telecom.models.PhoneNumber;

@RestController
public class CustomerController {

  @Autowired
  private ICustomer customer;

  public CustomerController(ICustomer customer)
  {
      this.customer = customer;
  }

  @GetMapping("/customer/{customerId}/phoneNumbers")
  public List<PhoneNumber> getPhoneNumberByCustomerId(@PathVariable int customerId)
  {
    var phoneNumbers = customer.getPhoneNumberByCustomerId(customerId);

    return phoneNumbers;
  }
}
