interface UPI{
    default void payment(){
        System.out.println("Payment using UPI...");
    }
}
interface Credit_card{
    default void payment(){
        System.out.println("Payment using credit card...");
    }
}
interface Debit_card{
    default void payment(){
        System.out.println("Payment using debit card...");
    }
}
class PayClass implements UPI, Credit_card, Debit_card{
    public void payment(){
        UPI.super.payment();
        Credit_card.super.payment();
        Debit_card.super.payment();

        System.out.println("Payment is done...");
    }
}

public class Interface3 {
    public static void main (String[] args) {
        PayClass p = new PayClass();
        p.payment();

    }
    
}
