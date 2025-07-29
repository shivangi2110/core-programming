package JAVA_ARRAYS.Level2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            height[i] = scanner.nextDouble() / 100;
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = scanner.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        System.out.println("\nHeight(m)  Weight(kg)  BMI     Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f      %.2f        %.2f   %s%n", height[i], weight[i], bmi[i], status[i]);
        }
    }
}
