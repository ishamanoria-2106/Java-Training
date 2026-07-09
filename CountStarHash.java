import java.util.*;

public class CountStarHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int countStar = 0;
        int countHash = 0;

        for(char ch : s.toCharArray()){
            if (ch == '*') countStar++;
            else if (ch == '#') countHash++;
        }

        System.out.println(countStar - countHash);

        sc.close();
    }    
}
