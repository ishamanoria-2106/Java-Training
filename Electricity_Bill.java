import java.util.*;
public class Electricity_Bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of units used: ");
        int units = sc.nextInt();
        double bill = 50;

        if(units>=0 && units<=100){
            bill += units*1.5;
        }
        else if(units<=200){
            bill += (100*1.5) + (units-100)*3.5;
        }
        else{
            bill += (100*1.5) + (100*3.5) + (units-200)*5;
        }

        if (bill > 2000){
            bill = bill * 1.1;
            
        }
        
        System.out.println("Your total electricity bill is: "+ bill);
        sc.close();
    }
}