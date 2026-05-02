class Student{
    private int roll_no;
    private String name;
    private int age;
    private String section;

    Student(int r, String name, int age, String sec) {
        this.roll_no = r;
        this.name = name;
        this.age = age;
        this.section = sec;
    }
    private void study(){
        System.out.println("Don't disturb me...I'm studying.");
    }
    private void sleep(){
        System.out.println("I'm sleeping");
    }

    public int getRoll_no(){
        return this.roll_no;
    }
    public void setRoll_no(int roll_no){
        this.roll_no = roll_no;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getSec(){
        return this.section;
    }
    public void setSec(String sec){
        this.section = sec;
    }

    public void callstudy(){
        this.study();
    }
    public void callsleep(){
        this.sleep();
    }

}
public class Encaps1 {
    public static void main(String[] args) {
        Student s = new Student(374, "Isha Manoria", 20, "H");
        System.out.println(s.getAge());
        s.callsleep();
    }
    
}

