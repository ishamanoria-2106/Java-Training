class Bank{
    //Attributes
    private String Acc_no;
    private String password;
    private String Acc_holder;
    private double balance;

    //Constructors
    Bank(String acc_no, String pass, String acc_holder, double balance){
        this.Acc_no = acc_no;
        this.password = pass;
        this.Acc_holder = acc_holder;
        this.balance = balance;
    }

    //Behaviour
    public void Withdraw(int amt){
        if (this.balance>=amt){
            this.balance = this.balance - amt;
            System.out.println("The money is withdrawed...");
        }
        else{
            System.out.println("Insuffiencient Balance!!!");
        }
        
    }
    public void Deposit(int amt){
        this.balance += amt;
        System.out.println(amt + " is deposited...");
    }
    

    //getter() and setter()
    public String getAcc_no(){
        return this.Acc_no;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getAcc_holder(){
        return this.Acc_holder;
    }
    public void setAcc_holder(String Acc_holder){
        this.Acc_holder = Acc_holder;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance; 
    }
}


public class Encaps2 {
    public static void main(String[] args) {
        Bank b = new Bank("AXL12580", "Im5214", "Isha", 250840);
        System.out.println(b.getAcc_holder());
    }
    
}
