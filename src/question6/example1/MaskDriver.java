/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Raghavendra Reddy
 */
public class MaskDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Answer for the question6: Raghavendra Reddy");
        System.out.println("Here we are trying to access a text file which is"
                + "\nnot available at the specified location,therefore we will"
                + "\nget a file not found exception");
        Scanner scan = new Scanner(new File("input.txt"));
        while (scan.hasNext()) {
            String name = scan.next();
            double price = scan.nextDouble();
            Mask mask = new Mask(name, price);
        }
    }

}
