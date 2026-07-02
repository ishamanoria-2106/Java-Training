public class LargestAndSmallestNo {
    public static void main(String[] args) {
        int[] arr = {12, 3, 10, 8, 5, 1, 32, 3};
        
        int l1 = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;

        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;
        int s3 = Integer.MAX_VALUE;

        for(int a:arr){
            if (a > l1) {
                l2 = l1;
                l1 = a;
            } 
            else if (a > l2 && a != l1) {
                l2 = a;
            }
            if (a < s1) {
                s3 = s2;
                s2 = s1;
                s1 = a;
            } else if (a < s2 && a != s1) {
                s3 = s2;
                s2 = a;
            } else if (a < s3 && a != s1 && a != s2) {
                s3 = a;
            }
        }
        System.out.println("Second Largest: "+ l2);
        System.out.println("Third Smallest: "+ s3);

    }
    
}
