
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is "+(1.0*(num+num1)/2));

        // Give the first number:
// 8
// Give the second number:
// 2
// The average is 5.0

    }
}
