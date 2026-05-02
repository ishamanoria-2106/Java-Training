interface Animal {
    void Sound();

    default void eat(){
        System.out.println("Eating.....");
    }
}
interface Bird extends Animal{
    void fly();
    default void sleep(){
        System.out.println("Sleeping....");
    }
}
class Sparrow implements Bird {
    public void Sound(){
        System.out.println("Chirping....");
    }
    public void fly(){
        System.out.println("Flying.....");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Bird a = new Sparrow();
        a.Sound();
        a.sleep();
        a.eat();
        a.fly();
        
    }
    
}
