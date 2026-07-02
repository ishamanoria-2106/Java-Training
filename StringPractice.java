public class StringPractice {
    public static void main(String[] args) {
        /*String s1 = "abc";
        String s2 = "abc";

        for(int i=0; i<s1.length(); i++){
            System.out.println(s1.charAt(i));
        }

        System.out.println(s2.compareTo(s1));
        System.out.println(s1.equalsIgnoreCase(s2));
        */
       StringBuilder sb = new StringBuilder("Isha");
       sb.append(" Manoria");
       //sb.delete(4,5);
       //sb.reverse();
       //sb.insert(0, "I ");
       //sb.setCharAt(2, 'z');
       sb.replace(0,4,"Disha");

       System.out.println(sb);
    }
}
