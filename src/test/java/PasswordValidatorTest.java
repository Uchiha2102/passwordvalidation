import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testPasswordWithLessThan8Characters() {
        String shortPassword = "abc123";
        assertFalse(PasswordValidator.LengthValid(shortPassword));
    }

    @Test
    void testPasswordContainsDigits() {
        String validPassword = "var12345";
        assertTrue(PasswordValidator.hasDigits(validPassword));
    }
    @Test
    void testPasswordWithUpperAndLowerCase(){
    String UpperLowerCase = "ABCabc";
    assertTrue(PasswordValidator.containsBothCases(UpperLowerCase));
    }

}
