package belong.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import belong.telecom.interfaces.ITelecomServices;
import belong.telecom.models.PhoneNumber;

@RestController
public class CustomerController {

  @Autowired
  private ITelecomServices telecomServices;

  public CustomerController(ITelecomServices telecomServices)
  {
      this.telecomServices = telecomServices;
  }

  @GetMapping("/customer/{customerId}/phoneNumbers")
  public List<PhoneNumber> getPhoneNumberByCustomerId(@PathVariable int customerId)
  {
    var phoneNumbers = telecomServices.getPhoneNumberByCustomerId(customerId);

    return phoneNumbers;
  }
}
