import java.util.*;
public class Login_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxattempt = 3;
        int correct_pass = 2580; 

        while (maxattempt >0){
            maxattempt--;
            System.out.println("Enter your password: ");
            int pass = sc.nextInt();

            if(pass == correct_pass){
                System.out.println("Login Successful.");
                return;

            }
        }
        System.out.println("Account locked.");
        sc.close();

        
    }
    
}
