import java.util.*;

public class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandies = 0;

        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {

            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int extraCandies = sc.nextInt();
        sc.close();


    }
    
}
