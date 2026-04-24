import java.util.*;
public class Warehouse_Inventory_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of products in the warehouse: ");
        int n = sc.nextInt();
        int total = 0;

        for(int i=1; i<=n; i++){
            System.out.println("Product :"+ i);

            System.out.println("Enter the current stock: ");
            int current = sc.nextInt();

            System.out.println("Enter the minimum required stock: ");
            int  minreq = sc.nextInt();

            if(current<minreq){
                System.out.println("Restock needed for product: "+ i);
                total++;
            }
        }
        System.out.println("Total number of products needs to be restocked: "+ total);
        sc.close();

    }
    
}
