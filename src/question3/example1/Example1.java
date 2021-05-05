/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3.example1;

/**
 *
 * @author Raghavendra Reddy
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int intVar;
        double doubleVar;
        long longVar;
        float floatVar;

        intVar = 10;

//Implicit type casting        
        longVar = intVar;
        floatVar = longVar;
        doubleVar = floatVar;

        System.out.println("Answer by Raghavendra Reddy: question 3");
        System.out.println("Implicit type casting values");
        System.out.println("Value of int: " + intVar);
        System.out.println("Value of double: " + doubleVar);
        System.out.println("Value of float: " + floatVar);
        System.out.println("Value of long: " + longVar);

//Explicit type casting
        doubleVar = 12.50;
        floatVar = (float) doubleVar;
        longVar = (long) floatVar;
        intVar = (int) doubleVar;

        System.out.println("Explicit type casting values");
        System.out.println("Value of double: " + doubleVar);
        System.out.println("Value of float: " + floatVar);
        System.out.println("Value of long: " + longVar);
        System.out.println("Value of int: " + intVar);

    }

}
