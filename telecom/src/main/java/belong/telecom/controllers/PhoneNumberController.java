package belong.telecom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import belong.telecom.interfaces.IphoneNumber;
import belong.telecom.models.PhoneNumber;

@RestController
public class PhoneNumberController {

  @Autowired
  private IphoneNumber phoneNumber;

  public PhoneNumberController(IphoneNumber phoneNumber)
  {
      this.phoneNumber = phoneNumber;
  }

  @GetMapping("/phoneNumbers")
  public List<PhoneNumber> GetPhoneNumber()
  {
      var phoneNumbers = phoneNumber.getPhoneNumbers();

      return phoneNumbers;
  }

  @PatchMapping("/activate/{number}")
  public boolean ActivatePhoneNumber(@PathVariable String number)
  {
      var isSuccessed = phoneNumber.activePhoneNumber(number);

      return isSuccessed;
  }
}
