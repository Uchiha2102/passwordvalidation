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
    void testPasswordWithUpperAndLowerCase() {
        String UpperLowerCase = "ABCabc";
        assertTrue(PasswordValidator.containsBothCases(UpperLowerCase));
    }

    @Test
    void testPasswordIsWeak() {
        String[] weakPasswords = {"12345678", "Password1", "Aa345678", "qwertz", "87654321"};
        for (String password : weakPasswords) {
            assertTrue(PasswordValidator.WeakPassword(password));
        }
    }
}
