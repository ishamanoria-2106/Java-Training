import java.util.*;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        //int[] array = {10, 20, 30, 40, 50};
        //int[] array = new int[] {10, 20, 30, 40, 50};

        int[] array1 = new int[n];

        for(int i = 0; i<n; i++){
            array1[i] = sc.nextInt();
        }
        
        for(int i = 0; i<n; i++){
            System.out.println(array1[i]);
        }
        sc.close();
    }
    
}
