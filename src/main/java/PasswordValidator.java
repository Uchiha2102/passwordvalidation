public class PasswordValidator {

    public static boolean LengthValid(String password) {
        return password.length() >= 8;
    }

    public static boolean hasDigits(String password) {
        return password.matches(".*\\d.*");
    }

    public static boolean containsBothCases(String password) {
        return password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }

    public static boolean WeakPassword(String password) {
        if ("12345678".equals(password)) {
            return true;
        }
        if ("Password1".equals(password)) {
            return true;
        }
        if ("Aa345678".equals(password)) {
            return true;
        }
        if ("qwertz".equals(password)) {
            return true;
        }
        if ("87654321".equals(password)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String testPassword = "Neue4ische";
        System.out.println("length valid" + LengthValid(testPassword));
        System.out.println("Contains Digits" + hasDigits(testPassword));
        System.out.println("Contains upper and lower case" + containsBothCases(testPassword));
        System.out.println("Is common password" + WeakPassword(testPassword));
    }
}

