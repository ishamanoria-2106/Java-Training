interface A{
    public static final int rollNo = 5;
    void show();

    default void present(){
        System.out.println("Inside A");
    }
}
interface B{
    void show();

    default void present(){
        System.out.println("Inside B");
    }
}
class C implements A,B{
    public void present(){
        B.super.present();
        A.super.present();
    }
    public void show(){
        System.out.println("Showing.....");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.present();
    }
    
}
