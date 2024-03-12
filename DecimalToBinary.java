import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        int number;
        int i = 0;
        System.out.println("Only for the positive integers!");
        System.out.println("Enter a decimal number to convert it into binary:");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        int binary[] = new int[100];

        while (number != 0) {
            binary[i] = number % 2;
            number = number / 2;
            i++;
        }

        System.out.println("Binary formation:");

        for (int j = i - 1; j >= 0; j--) {

            System.out.println(binary[j]);
        }

    }
}