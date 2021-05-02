package belong.telecom.interfaces;

import java.util.List;

import org.springframework.stereotype.Component;

import belong.telecom.models.PhoneNumber;

@Component
public interface IPhoneNumberGenerator {

  boolean activatePhoneNumber(String phoneNumber);

  List<PhoneNumber> getAllPhoneNumbers();

  List<PhoneNumber> getSingleCustomerPhoneNumber(int customerId);
}
