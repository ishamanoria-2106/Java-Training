import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount you want to withdraw: ");
        int withdraw = sc.nextInt();

        int balance = 5000;
        int min_balance = 1000;

        if (withdraw > balance){
            System.out.println("Transaction failed: Insuffiecient balance.");
        }
        else if ((balance - withdraw) < min_balance) {
            System.out.println("Transaction Failed: Minimum balance violation.");
        }
        else {
            System.out.println("Transaction Successful.");
        }
        sc.close();
    }
    
}
