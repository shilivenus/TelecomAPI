package belong.telecom;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import belong.telecom.controllers.CustomerController;
import belong.telecom.interfaces.ITelecomServices;
import belong.telecom.models.PhoneNumber;

@SpringBootTest
class CustomerControllerTests {

	@InjectMocks
	CustomerController customerController;

	@Mock
	ITelecomServices telecomServices;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void GetPhoneNumberByCustomerId_CorrectId_ReturnListOfPhoneNumber() {
		//Arrange
		var numbers = new ArrayList<PhoneNumber>();
		numbers.add(new PhoneNumber("0411111111", true));
		numbers.add(new PhoneNumber("0411111112", true));

		when(telecomServices.getPhoneNumberByCustomerId(anyInt())).thenReturn(numbers);

		//Act
		var result = customerController.getPhoneNumberByCustomerId(1).toArray();

		//Assert
		assertArrayEquals(numbers.toArray(), result);
	}

	@Test
	void GetPhoneNumberByCustomerId_InCorrectId_ReturnNotFound() {
		//Arrange
		when(telecomServices.getPhoneNumberByCustomerId(anyInt())).thenReturn(null);

		//Act
		var result = customerController.getPhoneNumberByCustomerId(1);

		//Assert
		assertNull(result);
	}
}
