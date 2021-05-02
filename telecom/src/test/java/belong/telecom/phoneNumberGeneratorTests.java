package belong.telecom;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import belong.telecom.resource.phoneNumberGenerator;

@SpringBootTest
class phoneNumberGeneratorTests {
  
  @Test
	void ActivatePhoneNumber_NumberIsInList_ReturnTrue() {
		//Arrange
		var generator = new phoneNumberGenerator();

    //Act
    var result = generator.activatePhoneNumber("0411111111");

    //Assert
    assertTrue(result);
	}

  @Test
	void ActivatePhoneNumber_NumberIsNotInList_ReturnFalse() {
		//Arrange
		var generator = new phoneNumberGenerator();

    //Act
    var result = generator.activatePhoneNumber("04111");

    //Assert
    assertFalse(result);
	}
}
