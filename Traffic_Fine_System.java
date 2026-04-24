import java.util.*;
public class Traffic_Fine_System {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the speed of the vehicle: ");
        int speed = sc.nextInt();

        System.out.println("The voilation is repeated (true/false): ");
        boolean repeated = sc.nextBoolean();

        int fine = 0;

        if(speed > 100){
            fine += 1000;
        }
        else if(speed > 80){
            fine += 500;
        }

        if (repeated){
            fine = fine*2;
        } 

        System.out.println("Total fine of your vehicle is: "+ fine);
        sc.close();

    }
    
}
