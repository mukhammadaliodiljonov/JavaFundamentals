import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {

        int decimal, reminder;
        String Hexadecimal = "";
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        System.out.println("Enter an integer to convert it into Hexadecimal:");
        Scanner scan = new Scanner(System.in);
        decimal = scan.nextInt();

        while (decimal > 0) {

            reminder = decimal % 16;
            Hexadecimal = hex[reminder] + Hexadecimal;
            decimal = decimal / 16;
        }

        System.out.println("Hexadecimal formation: " + Hexadecimal);

    }

}