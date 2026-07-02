public class CinemaBooking {
    public static void main(String[] args) {
        int max = 0;
        int count = 0;
        int[] seats = {1,0,0,0,1,0,0};

        for (int seat:seats){
            if (seat == 0){
                count++;
            }
            else{
                count = 0;
            }
            if (count>max){
                    max = count;
            }
            
        }
        System.out.println(max);
    }
}