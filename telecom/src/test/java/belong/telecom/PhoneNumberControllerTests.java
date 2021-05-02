package belong.telecom;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import belong.telecom.controllers.PhoneNumberController;
import belong.telecom.interfaces.ITelecomServices;
import belong.telecom.models.PhoneNumber;

@SpringBootTest
class PhoneNumberControllerTests {

	@InjectMocks
	PhoneNumberController phoneNumberController;

	@Mock
	ITelecomServices telecomServices;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void GetPhoneNumber_FindNumbers_ReturnListOfPhoneNumber() {
		//Arrange
		var numbers = new ArrayList<PhoneNumber>();
		numbers.add(new PhoneNumber("0411111111", true));
		numbers.add(new PhoneNumber("0411111112", true));

		when(telecomServices.getPhoneNumbers()).thenReturn(numbers);

		//Act
		var result = phoneNumberController.GetPhoneNumber().toArray();

		//Assert
		assertArrayEquals(numbers.toArray(), result);
	}

	@Test
	void ActivatePhoneNumber_CorrectNumber_ReturnTrue() {
		//Arrange
		when(telecomServices.activePhoneNumber(anyString())).thenReturn(true);

		//Act
		var result = phoneNumberController.ActivatePhoneNumber("number");

		//Assert
		assertTrue(result);
	}

  @Test
	void ActivatePhoneNumber_InCorrectNumber_ReturnFalse() {
		//Arrange
		when(telecomServices.activePhoneNumber(anyString())).thenReturn(false);

		//Act
		var result = phoneNumberController.ActivatePhoneNumber("number");

		//Assert
		assertFalse(result);
	}
}
