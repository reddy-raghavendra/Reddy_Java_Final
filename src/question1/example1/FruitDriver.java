/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.example1;

/**
 *
 * @author Raghavendra Reddy
 */
public class FruitDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Orange orange = new Orange();
        System.out.println("Answer by Raghavendra Reddy: question 1");
        orange.containSeeds();
        orange.nutrients();
        System.out.println("Sour percentage in oranges is: "
                + orange.sourPercentage());

    }

}
