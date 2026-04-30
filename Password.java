import java.util.*;
public class Password {
    static String passwordStrength (String password) {
        boolean hasLength = false;

        if (password.length() >= 8){
            hasLength = true;
        }
        
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean specialChar = false;
        boolean hasLower = false;

        for (char c: password.toCharArray()){
            if (Character.isDigit(c)){
                hasDigit = true;
            }
            else if (Character.isUpperCase(c)){
                hasUpper = true;
            }
            else if (Character.isLowerCase(c)){
                hasLower = true;
            }
            else {
                specialChar = true;
            }
        }
        if (hasDigit && hasUpper && hasLower && specialChar){
            return "Strong Password";
        }
        else {
            return "Weak Password";
        }
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        String status = passwordStrength(password);

        System.out.println(status);
        sc.close();
    }
    
}
