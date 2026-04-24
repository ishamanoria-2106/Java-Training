import java.util.*;
public class Parking {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter total number of hours: ");
        double hours = sc.nextDouble();
        double bill;

        if(hours<=2){
            bill = hours*100;
        }
        else if(hours<=5){
            bill = 2*100 + (hours-2)*50;
        }
        else{
            bill = 2*100 + 3*50 + (hours-5)*25;
        }
        System.out.println("Your total parking lot bill is: "+ bill);
        sc.close();
    }
    
}
