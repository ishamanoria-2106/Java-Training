import java.util.*;
public class Odd_Even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        
        int evencount=0;
        int oddcount=0;

        while (true){
            int num = sc.nextInt();

            if(num == 0){
                break;
            }

            if(num % 2 == 0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("The even count is: "+ evencount);
        System.out.println("The odd count is: "+ oddcount);

        sc.close();

    }
    
}
