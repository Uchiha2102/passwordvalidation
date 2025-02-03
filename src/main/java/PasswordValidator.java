public class PasswordValidator {

    public static boolean LengthValid(String password){
        return password.length() >=8;
    }
    public static boolean hasDigits (String password){
        return password.matches(".*\\d.*");
    }
    public static void main(String[] args) {
    }

}
