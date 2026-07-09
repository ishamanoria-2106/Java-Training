public class QuickSort {
    static void quickSort(int[] arr, int p, int r){
        if (p<r){
            int pivotIndex = partition(arr, p, r);
            quickSort(arr, p, pivotIndex-1);
            quickSort(arr, pivotIndex+1, r);
        }
    }

    static int partition(int[] arr, int p, int r){
        int pivot = arr[r];
        int i= p-1;
        for (int j=p; j<r; j++){
            if(arr[j]<=pivot){
                int temp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = temp;
                i++;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 2, 0, 7, 2, 8, 9, 1, 3};
        quickSort(arr, 0, arr.length-1);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
