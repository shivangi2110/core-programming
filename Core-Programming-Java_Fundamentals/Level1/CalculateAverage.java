import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        System.out.print("Enter third number: ");
        double third = sc.nextDouble();
        double average = (first + second + third) / 3;
        System.out.println("The average of the three numbers is: " + average);
    }
}
