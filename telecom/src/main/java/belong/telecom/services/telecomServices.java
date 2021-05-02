package belong.telecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import belong.telecom.interfaces.ICustomer;
import belong.telecom.interfaces.ITelecomServices;
import belong.telecom.interfaces.IphoneNumber;
import belong.telecom.models.PhoneNumber;

@Component
public class telecomServices implements ITelecomServices{

  @Autowired
  private ICustomer customer;

  @Autowired
  private IphoneNumber phoneNumber;

  public telecomServices(ICustomer customer, IphoneNumber phoneNumber){
    this.customer = customer;
    this.phoneNumber = phoneNumber;
  }

  @Override
  public List<PhoneNumber> getPhoneNumberByCustomerId(int customerId) {
    return customer.getPhoneNumberByCustomerId(customerId);
  }

  @Override
  public List<PhoneNumber> getPhoneNumbers() {
    return phoneNumber.getPhoneNumbers();
  }

  @Override
  public boolean activePhoneNumber(String number) {
    return phoneNumber.activePhoneNumber(number);
  }
  
}
