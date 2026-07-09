public class Sorting {
    static void mergeSort(int[] arr, int p, int r){
        if (p<r){
            int q = p+(r-p)/2;
            mergeSort(arr, p, q);
            mergeSort(arr, q+1, r);
            merge(arr, p, q, r);
        }
    }
    static void merge(int[] arr, int p, int q, int r){
        int l1 = q-p+1;
        int l2 = r-q;

        int[] left = new int[l1];
        int[] right = new int[l2];

        for(int i=0; i<l1; i++){
            left[i] = arr[p+i];
        }
        for(int j=0; j<l2; j++){
            right[j] = arr[q+1+j];
        }
        int i=0, j=0, k=p;
        while(i<l1 && j<l2){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                k++;
                i++;
            }
            else{
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while(i<l1){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j<l2){
            arr[k] = right[j];
            k++;
            j++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 9, 8, 4, 9, 0, 8, 3, 8, 3};
        mergeSort(arr, 0, arr.length-1);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
