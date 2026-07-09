public class Reverse_recur {
    static String rev(String s){
        if (s == null || s.length() <= 1){
            return s;
        }
        return rev(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Hello";
        String reverse = rev(str);
        System.out.println(reverse);
    }
}
