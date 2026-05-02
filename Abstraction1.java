abstract class Animal{
    int no_of_legs;
    String name;

    abstract void sound(); //abstract method

    void eat(){ //non-abstract method
        System.out.println("Don't disturb me, I'am eating....");
    }
}
abstract class Bird extends Animal{
    abstract void color();
    void fly(){
        System.out.println("Panchi bani udti phiruuuuuuuuuu....");
    }
}
class Koyal extends Bird{
    void sound(){
        System.out.println("koo...kooo");
    }
    void color(){
        System.out.println("Black beauty...");
    }
}

public class Abstraction1 {
    public static void main (String[] args) {
        Bird b = new Koyal();
        b.eat();
        b.sound();
        b.fly();
        b.color();
        b.no_of_legs = 2;
        System.out.println(b.no_of_legs);

    }
    
}
