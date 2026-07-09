public class BinarySearch {
    static int binarySearch(int[] arr, int p, int r, int key){
        int left = p;
        int right = r;

        while(left<=right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == key){
                return mid + 1;
            }
            else if (arr[mid] >= key){
                right = mid - 1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int key = 20;
        int position = binarySearch(arr, 0, arr.length-1, key);
        System.out.print(position);
    }
    
}
