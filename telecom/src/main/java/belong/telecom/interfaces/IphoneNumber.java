package belong.telecom.interfaces;

import java.util.List;

import org.springframework.stereotype.Component;

import belong.telecom.models.PhoneNumber;

@Component
public interface IphoneNumber {

  List<PhoneNumber> getPhoneNumbers();

  boolean activePhoneNumber(String phoneNumber);
}
