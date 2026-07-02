import java.util.*;

public class DistinctChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        int l=0;
        int max=0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) +1);

            while(map.size() > k){
                if(map.get(str.charAt(l)) -1 == 0){
                    map.remove(str.charAt(l));
                    l++;
                    continue;
                }
                map.put(str.charAt(l), map.get(str.charAt(l))-1);
                l++;
            }
            if (max<i-l+1){
                max = i-l+1;
            }
        }
        System.out.println(max);
        sc.close();
    }
    
}
