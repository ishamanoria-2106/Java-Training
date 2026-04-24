import java.util.*;
public class Discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your shopping amount: ");
        int amount = sc.nextInt();

        System.out.println("The customer is premium? (true/false): ");
        boolean premium = sc.nextBoolean();

        double final_amount = 0.0;

        if(amount >=5000){
            final_amount += amount * 0.8; 
        }
        else if(amount >= 3000){
            final_amount += amount * 0.9;
        }
        else{
            System.out.println("No Discount");
        }

        if(premium){
            final_amount = final_amount * 0.95;
        }

        System.out.println("Your total bill is: "+ final_amount);
        sc.close();
    }
    
}
