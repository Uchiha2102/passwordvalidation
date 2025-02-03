import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testLengthValid() {

        // Testfall 1: Passwort mit weniger als 8 Zeichen
        String shortPassword = "abc123";
        assertFalse(PasswordValidator.LengthValid(shortPassword));
    }
}