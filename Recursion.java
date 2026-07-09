public class Recursion {
    static void numbers(int n){  //Initialization
        if(n==0) return;  //Condition
        n--;   //Updation
        numbers(n);    //Recursion calls

        if(n%2== 0){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        numbers(20);
    }
    
}
