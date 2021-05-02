package belong.telecom.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import belong.telecom.interfaces.IPhoneNumberGenerator;
import belong.telecom.models.PhoneNumber;

@Component
public class phoneNumberGenerator implements IPhoneNumberGenerator{

  @Override
  public boolean activatePhoneNumber(String phoneNumber) {
    var allNumbers = getAllPhoneNumbers();

    for(int i = 0; i<allNumbers.size(); i++)
    {
      var number = allNumbers.get(i);
      if(number.getTelePhoneNumber().equals(phoneNumber))
        {
          number.setIsActivate(true);
            return true;
        }
    }

    return false;
  }

  @Override
  public List<PhoneNumber> getAllPhoneNumbers() {
    var numbers = new ArrayList<PhoneNumber>();
    numbers.add(new PhoneNumber("0411111111", true));
    numbers.add(new PhoneNumber("0411111112", true));
    numbers.add(new PhoneNumber("0411111113", false));
    numbers.add(new PhoneNumber("0411111114", false));
    numbers.add(new PhoneNumber("0411111115", true));

    return numbers;
  }

  @Override
  public List<PhoneNumber> getSingleCustomerPhoneNumber(int customerId) {
    var numbers = new ArrayList<PhoneNumber>();
    numbers.add(new PhoneNumber("0411111111", true));
    numbers.add(new PhoneNumber("0411111112", true));
    numbers.add(new PhoneNumber("0411111113", false));

    return numbers;
  }
  
}
