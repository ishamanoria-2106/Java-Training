public class Longest_Subarray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,0,1,1,0,1};
        int k=4;
        int max_length = 0;
        int sum = 0;
        int left = 0;

        for (int r=0; r<arr.length; r++){
            sum += arr[r];
            if (sum<=k && max_length < r-left + 1){
                max_length = r-left+1;
            }

            while(sum>k){
                sum -= arr[left];
                left++;
            }

            if (sum<=k && max_length < r-left + 1){
                max_length = r-left+1;
            }
        }
        System.out.println(max_length);
    }
}
