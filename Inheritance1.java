class Car{
    String color;
    String model;
    String brand;
    double mileage;
    int no_of_gears;

    Car(String color, String model, String brand, int mileage, int no_of_gears){
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.mileage = mileage;
        this.no_of_gears = no_of_gears;
    }

    void applyBrake(){
        System.out.println("Breaking...");
    }
    void applySpeed(){
        System.out.println("Speed...");
    }
    void shiftGear(){
        System.out.println("Changing gear...");
    }
}

class Verna extends Car{
    
    int capacity;

    Verna(String color, String model, String brand, int mileage, int no_of_gears, int capacity){
        super(color, model, brand, mileage, no_of_gears);
        this.capacity = capacity;
    }
    void airbags(){
        System.out.println("Airbags....");
    }
    
}

public class Inheritance1 {
    public static void main(String[] args) {
        Verna v = new Verna("Black", "V1", "Hyunadai", 18, 6, 5);
        System.out.println(v.color);
        System.out.println(v.brand);
        System.out.println(v.model);
        System.out.println(v.capacity);
        System.out.println(v.mileage);
        System.out.println(v.no_of_gears);
        v.applySpeed();
        v.applyBrake();
        v.airbags();
        v.shiftGear();

        
    }
    
}
