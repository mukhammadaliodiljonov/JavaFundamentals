import java.util.Scanner;

public class f1 {
    public static void main(String args[]) {

        System.out.println("Enter a number to do a multiplication table:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int i = 1;

        while (i <= 10) {
            System.out.println(a + " x " + i + " = " + a * i);
            i++;
        }

    }
}
