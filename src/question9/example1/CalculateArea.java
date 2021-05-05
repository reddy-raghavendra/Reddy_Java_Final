/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.example1;

/**
 *
 * @author Raghavendra Reddy
 */
public class CalculateArea {

    public static void main(String[] args) {
        double side1 = 14;
        double side2 = 5;
        double side3 = 6;
        System.out.println("Answer for question 9: Raghavendra Reddy");
        if (side1 >= side2 + side3 || side2 >= side1 + side3
                || side3 >= side1 + side2) {
            throw new ArithmeticException("The sum of two sides of triangle should be "
                    + "\ngreater than the third side");
        }
        System.out.println("Area of triangle is: " + calculateArea(side1, side2, side3));

    }

    public static double calculateArea(double side1, double side2, double side3) {
        double s = (Math.round((side1 + side2 + side3) * 100)
                / 100.0) / 2;
        return Math.round(Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
                * 100) / 100.0;
    }
}
