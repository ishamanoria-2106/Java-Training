import java.util.*;
public class Vending_machine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int trayNo;
        do{

        System.out.println("Tray1 | Beverages");
        System.out.println("Tray2 | Chocolates");
        System.out.println("Tray3 | Snacks");

        System.out.println("Select your tray by using (1/2/3/0): ");
        trayNo = sc.nextInt();
        switch(trayNo) {
            case 1:
                {
                    char stay;
                    do{
                    System.out.println("A. Pepsi  20");
                    System.out.println("B. Sprite  40");
                    System.out.println("C. Maaza  10");
                    System.out.println("D. Slice  25");
                    System.out.println("E. Coca-cola 30");

                    System.out.println("Item to purchase (A/B/C/D/E): ");
                    char choice = sc.next().charAt(0);

                    if(choice=='A')
                        total += 20;
                    else if(choice=='B')
                        total += 40;
                    else if(choice=='C')
                        total += 10;
                    else if(choice=='D')
                        total += 25;
                    else if(choice=='E')
                        total += 30;

                    System.out.println("Stay on the same tray (y/n): ");
                    stay = sc.next().charAt(0);
                    } while(stay!='n');
                    break;
                }
            case 2:
                {
                    char stay;
                    do{
                    System.out.println("A. Lays 40");
                    System.out.println("B. Kurkure 20");
                    System.out.println("C. Oreo 10");
                    System.out.println("D. Gooday 30");
                    System.out.println("E. Mad Angles 50");

                    System.out.println("Item to purchase (A/B/C/D/E): ");
                    char choice = sc.next().charAt(0);

                    if(choice=='A')
                        total += 40;
                    else if(choice=='B')
                        total += 20;
                    else if(choice=='C')
                        total += 10;
                    else if(choice=='D')
                        total += 30;
                    else if(choice=='E')
                        total += 50;

                    System.out.println("Stay on the same tray (y/n): ");
                    stay = sc.next().charAt(0);
                    } while(stay!='n');
                    break;
                }
            case 3:
                {
                    char stay;
                    do{
                    System.out.println("A. Dairy Milk 120");
                    System.out.println("B. Kitkat 40");
                    System.out.println("C. Munch 20");
                    System.out.println("D. Amul 55");
                    System.out.println("E. Milky Bar 80");

                    System.out.println("Item to purchase (A/B/C/D/E): ");
                    char choice = sc.next().charAt(0);

                    if(choice=='A')
                        total += 120;
                    else if(choice=='B')
                        total += 40;
                    else if(choice=='C')
                        total += 20;
                    else if(choice=='D')
                        total += 55;
                    else if(choice=='E')
                        total += 80;

                    System.out.println("Stay on the same tray (y/n): ");
                    stay = sc.next().charAt(0);
                    } while(stay!='n');
                    break;
                }
            default:
                break;

        } 
        } while(trayNo !=0);
        System.out.println("Your total bill is: "+ total);

    }

}