package belong.telecom.repos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import belong.telecom.interfaces.ICustomer;
import belong.telecom.interfaces.IPhoneNumberGenerator;
import belong.telecom.models.PhoneNumber;

@Component
public class CustomerRepository implements ICustomer {

  @Autowired
  private IPhoneNumberGenerator phoneNumberGenerator;

  public CustomerRepository(IPhoneNumberGenerator phoneNumberGenerator)
  {
      this.phoneNumberGenerator = phoneNumberGenerator;
  }
  
  @Override
  public List<PhoneNumber> getPhoneNumberByCustomerId(int customerId) {
    return phoneNumberGenerator.getSingleCustomerPhoneNumber(customerId);    
  }  
}