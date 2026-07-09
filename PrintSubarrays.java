public class PrintSubarrays {
    static void sub(int[] arr, int start, int end){
        if (end == arr.length){
            return;
        }
        else if (start > end){
            sub(arr, 0, end + 1);
        }
        else{
            System.out.print("[");
            for(int i = start; i<end; i++){
                System.out.print(arr[i] + ",");
            }
            System.out.print(arr[end] + "]");

            sub(arr, start + 1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.print("[]");
        sub(arr, 0, 0);
    }
}
