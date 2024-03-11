import java.util.Scanner;

public class Binary {
    public static void main(String args[]) 
    {

       System.out.println("enter the first Binary number:");
       Scanner scan = new Scanner(System.in);
       String First = scan.next();

       System.out.println("enter the second Binary number:");
       String Second = scan.next();

       int n1 = Integer.parseInt(First,2);
       int n2 = Integer.parseInt(Second,2);

       int addition = n1 + n2 ;
       int multiplication = n1 * n2;
       
       String n3 = Integer.toBinaryString(addition);
       String n4 = Integer.toBinaryString(multiplication);
       System.out.println("Addition of two binary numbers is :" + n3);
       System.out.println("Multiplication of two binary numbers is :" + n4);
    }
}
