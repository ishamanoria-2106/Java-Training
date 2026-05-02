import java.util.*;
class TravelAgencies{
    //Attributes
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;
    
    //Constructor
    TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
    
    //Getter and Setter
    public int getRegNo(){
        return this.regNo;
    }
    public void setRegNo(int regNo){
        this.regNo = regNo;
    }
    public String getAgencyName(){
        return this.agencyName;
    }
    public void setAgencyName(String agencyName){
        this.agencyName = agencyName;
    }
    public String getPackageType(){
        return this.packageType;
    }
    public void setPackageType(String packageType){
        this.packageType = packageType;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public boolean getFlightFacility(){
        return this.flightFacility;
    }
    public void setFlightFacility(boolean flightFacility){
        this.flightFacility = flightFacility;
    }
}

//Main method
public class Solution {

    //Static class 1
    static int findAgencywithHighestPackagePrice(TravelAgencies[] array){
        int max = 0;
        for (TravelAgencies agency : array){
            if(agency.getPrice()>max){
                max = agency.getPrice();
            }
        }
        return max;
    }

    //Static class 2
    static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] array, int regNo, String packageType){
        for (TravelAgencies agency: array){
            if(agency.getFlightFacility() && agency.getRegNo() == regNo && agency.getPackageType().equalsIgnoreCase(packageType)){
                return agency;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TravelAgencies[] array = new TravelAgencies[n];

        for(int i=0; i<n; i++){
            int regNo = sc.nextInt();
            sc.nextLine();
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            boolean flightFacility = sc.nextBoolean();

            TravelAgencies t = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
            array[i] = t;
        }
        int regNo = sc.nextInt();
        sc.nextLine();
        String packageType = sc.nextLine();

        System.out.println("------------Output------------------");


        int highest_price = findAgencywithHighestPackagePrice(array);
        TravelAgencies agency = agencyDetailsForGivenIdAndType(array, regNo, packageType);

        System.out.println(highest_price);
        if(agency!=null){
            System.out.println(agency.getAgencyName()+";"+agency.getPrice());
        }
        sc.close();
        
    }
    
}
