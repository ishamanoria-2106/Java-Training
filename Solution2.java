import java.util.*;

class Phone{
    //Attributes
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    //Constructor
    Phone(int phoneId, String os, String brand, int price){
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    //Getter and Setter
    public int getPhoneId(){
        return this.phoneId;
    }
    public void setPhoneId(int phoneId){
        this.phoneId = phoneId;
    }
    public String getOs(){
        return this.os;
    }
    public void setOs(String os){
        this.os = os;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}

//Main method
public class Solution2 {
    //Static class1
    static int findPriceforGivenBrand(Phone[] phones, String brand){
        int sum = 0;
        for (Phone p: phones){
            if (p.getBrand().equalsIgnoreCase(brand)){
                sum += p.getPrice();
            }
        }
        return sum;
    }

    //Static class2
    static Phone getPhoneIdBasedOnOs(Phone[] phones, String os){
        for (Phone p: phones){
            if (p.getOs().equalsIgnoreCase(os) && p.getPrice()>=50000){
                return p;
            }
            
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Phone[] phones = new Phone[n];

        for(int i =0; i<n; i++){
            int phoneId = sc.nextInt();
            sc.nextLine();
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();

            phones[i] = new Phone (phoneId, os, brand, price);
        }
        String brand = sc.nextLine();
        String os = sc.nextLine();

        System.out.println("\n==== OUTPUT =====\n");

        int price = findPriceforGivenBrand(phones, brand);
        if(price>0){
            System.out.println(price);
        }
        else{
            System.out.println("The given brand is not available.");
        }
        Phone outcome = getPhoneIdBasedOnOs(phones, os);
        if(outcome != null){
            System.out.println(outcome.getPhoneId());
        }
        else{
            System.out.println("No phones are available with specified os and price range.");
        }
        sc.close();
    }
    
}
