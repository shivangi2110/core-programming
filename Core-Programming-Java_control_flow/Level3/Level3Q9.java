package Level3;
import java.util.Scanner;

public class Level3Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Abundant Number: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is Not an Abundant Number");
        }

        scanner.close();
    }
}
