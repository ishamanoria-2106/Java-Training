public class Palindrome {
    /* private static boolean palindrome(String s, int start, int end){
        if (start >= end){
            return true;
        }
        if (s.charAt(start) != s.charAt(end)){
            return false;
        }
        return palindrome(s, start + 1, end - 1);
    }
    public static boolean isPalindrome(String s){
        if(s == null){
            return false;
        }
        s = s.toLowerCase();
        return palindrome(s, 0, s.length() - 1);
    }
        */
    
    static boolean isPalindrome(String s){
        if(s.length() == 1 || s.length() == 0) return true;

        return s.charAt(0) == s.charAt(s.length() - 1) &&
        isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(isPalindrome(str));
    }
    
}
