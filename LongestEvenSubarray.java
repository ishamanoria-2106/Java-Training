public class LongestEvenSubarray {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,0,3,1,0};
        int n = arr.length;
        int sum = 0;
        int max_length = 0;
        int left = 0;
        int right = n - 1;

        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        if (sum %2 == 0){
            System.out.println(n);
            return;
        }
        while(left < n && arr[left] %2 == 0){
            left++;
        }
        while(right >= 0 && arr[right] %2 == 0){
            right--;
        }
        max_length = right - left > right ? right - 1: right;
        System.out.println(max_length);
    }
}
