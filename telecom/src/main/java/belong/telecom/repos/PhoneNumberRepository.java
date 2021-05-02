package belong.telecom.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import belong.telecom.interfaces.IPhoneNumberGenerator;
import belong.telecom.interfaces.IphoneNumber;
import belong.telecom.models.PhoneNumber;

@Component
public class PhoneNumberRepository implements IphoneNumber {

  @Autowired
  private IPhoneNumberGenerator phoneNumberGenerator;

  public PhoneNumberRepository(IPhoneNumberGenerator phoneNumberGenerator)
  {
      this.phoneNumberGenerator = phoneNumberGenerator;
  }

  @Override
  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumberGenerator.getAllPhoneNumbers();
  }

  @Override
  public boolean activePhoneNumber(String phoneNumber) {
    return phoneNumberGenerator.activatePhoneNumber(phoneNumber);
  }
  
}
