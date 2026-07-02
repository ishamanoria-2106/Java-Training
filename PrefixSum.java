import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5,2};
        int k = 6;
        int n = arr.length;
        int max = 0;
        int sum = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i<n; i++){
            sum += arr[i];
            if(sum == k && max<i+1){
                max = i+1;
            }
            if(map.containsKey(sum-k)){
                max = max<(i-map.get(sum-k)) ? map.get(sum-k): max;
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        System.out.println(max);
    }
    
}
