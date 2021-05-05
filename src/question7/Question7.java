/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Raghavendra Reddy
 */
public class Question7 {

    public static void main(String[] args) {
        int numbers[] = new int[100];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("Answer by Raghavendra Reddy: question7");

        System.out.print("Enter an index to find the integer: ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        try {
            System.out.println("Integer at index " + index + " is "
                    + numbers[index]);
        } catch (IndexOutOfBoundsException execp) {
            System.out.println("Index " + index + " out of bounds");
        }
    }
}
