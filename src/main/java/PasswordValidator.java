public class PasswordValidator {

    public static boolean LengthValid(String password){
        return password.length() >=8;
    }
    public static boolean hasDigits (String password){
        return password.matches(".*\\d.*");
    }
    public static boolean containsBothCases( String password){
        return password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");
    }

    public static void main(String[] args) {
    }

}
