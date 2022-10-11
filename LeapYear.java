import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        System.out.println("Program For Check Leap Year");
        Scanner sc = new Scanner(System.in); 
            System.out.print("Enter the Year which you want to Check: ");
            int y = sc.nextInt();
            sc.close();
            if((y%4==0 && y%100!=0)||y%400==0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not Leap Year");
            }

    }
    
}
