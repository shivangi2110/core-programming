package JAVA_ARRAYS.Level1;

import java.util.Scanner;

public class MultiplicationFrom6To9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to get its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4];
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 6);
        }
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }
    }
}
