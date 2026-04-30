import java.util.*;
public class Cab_Fare_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance (in km): ");
        int distance = sc.nextInt();

        System.out.println("Driving at night? (true/false): ");
        boolean night = sc.nextBoolean();

        double fare = 0.0;

        if (distance <= 5){
            fare += distance * 50;
        }
        else if (distance <= 10){
            fare += (5 * 50) + (distance - 5) * 40;
        }
        else{
            fare += (5 * 50) + (5 * 40) + (distance - 10) * 30;
        }

        if(night){
            fare += fare * 0.2;
        }

        System.out.println("Your total cab fare is: "+ fare);
        sc.close();
    }
    
}
