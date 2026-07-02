import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int n = arr.length;
        Arrays.sort(arr); //-4,-1,-1,0,1,2
        List<List<Integer>> lst = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(i<0 && arr[i]==arr[i-1]){
                continue;
            }
            int l=i+1, r = n-1, sum=0;
            while(l<r){
                sum = arr[i]+arr[l]+arr[r];
                if(sum==0){
                    lst.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    l++;
                    r--;
                    while(l<r && arr[l] == arr[l-1]){
                        l++;
                    }
                    while(l<r && arr[r] == arr[r+1]){
                        r--;
                    }
                }
                else if(sum<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        System.out.println(lst);
    }
    
}
