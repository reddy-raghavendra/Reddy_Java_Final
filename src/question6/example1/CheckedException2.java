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
public class CheckedException2 {

    public static void main(String[] args) {
        System.out.println("Answer by Raghavendra Reddy: question1");
        try {
            Scanner scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
        }

    }
}
