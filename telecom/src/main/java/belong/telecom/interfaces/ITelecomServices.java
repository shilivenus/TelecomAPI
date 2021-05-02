package belong.telecom.interfaces;

import java.util.List;

import belong.telecom.models.PhoneNumber;

public interface ITelecomServices {

  List<PhoneNumber> getPhoneNumberByCustomerId(int customerId);

  List<PhoneNumber> getPhoneNumbers();

  boolean activePhoneNumber(String number);
}
