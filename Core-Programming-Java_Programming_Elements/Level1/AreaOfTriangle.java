package Level1;

import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;

        System.out.println("The area of the triangle is " + String.format("%.2f", areaCm) +
                " square centimeters and " + String.format("%.2f", areaInches) +
                " square inches.");
    }
}
