public class MethodOverload {
    static int add (int a, int b){
        return a+b;
    }
    static int add (int a, int b, int c){
        return a+b+c;
    }
    static double add (double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,25));
         System.out.println(add(10.1,20.2));
        
    }
    
}
