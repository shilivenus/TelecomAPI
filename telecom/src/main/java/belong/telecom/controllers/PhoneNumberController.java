package belong.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import belong.telecom.interfaces.ITelecomServices;
import belong.telecom.models.PhoneNumber;

@RestController
public class PhoneNumberController {

  @Autowired
  private ITelecomServices telecomServices;

  public PhoneNumberController(ITelecomServices telecomServices)
  {
      this.telecomServices = telecomServices;
  }

  @GetMapping("/phoneNumbers")
  public List<PhoneNumber> GetPhoneNumber()
  {
      var phoneNumbers = telecomServices.getPhoneNumbers();

      return phoneNumbers;
  }

  @PatchMapping("/activate/{number}")
  public boolean ActivatePhoneNumber(@PathVariable String number)
  {
      var isSuccessed = telecomServices.activePhoneNumber(number);

      return isSuccessed;
  }
}
