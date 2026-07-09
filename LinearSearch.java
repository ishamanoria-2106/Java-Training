public class LinearSearch {
    static int linearSearch(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {10, 1, 5, 7, 2, 5, 6, 3};
        int targetVal = 7;

        int result = linearSearch(array, targetVal);
        if (result != -1){
            System.out.println("Element found at " + result + " index");
        }
        else{
            System.out.println("Element not found.");
        }
    }
    
}
