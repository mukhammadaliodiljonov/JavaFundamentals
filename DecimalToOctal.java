import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {

        System.out.println("Enter a decimal number to convert Octal:");
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();

        int octal[] = new int[100];
        int i = 0;

        while (decimal != 0) {

            octal[i] = decimal % 8;
            decimal = decimal / 8;
            i++;

        }

        System.out.println("Octal formation:");

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(octal[j]);
        }
    }
}