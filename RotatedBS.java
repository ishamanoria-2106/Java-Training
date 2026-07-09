public class RotatedBS {
    static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == key){
                return mid + 1;
            }
            if (arr[low] <= arr[mid]){
                if(arr[low] <= key && arr[mid] >= key){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(arr[mid] <= key && arr[high] >= key){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {50, 60, 10, 20, 30, 40};
        int key = 60;
        int position = binarySearch(arr, key);
        System.out.println(position); 
    }
    
}
