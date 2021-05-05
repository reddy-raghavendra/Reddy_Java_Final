/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Raghavendra Reddy
 */
public class Throws {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Answer for question 9: Raghavendra Reddy");
        Scanner scan = new Scanner(new File("input.txt"));
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }

    }
}
