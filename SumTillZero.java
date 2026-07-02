import java.util.*;
public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> lst = new ArrayList<>();

        int ele = sc.nextInt();
        while (ele!=0){
            lst.add(ele);
            ele = sc.nextInt();
        }

        System.out.println("Printing...");

        //for(int i:lst){
          //  System.out.println(i);
        //}
        System.out.println(lst.get(2));

    }
}
