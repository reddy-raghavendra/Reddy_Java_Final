/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3.example2;

/**
 *
 * @author Raghavendra Reddy
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer by Raghavendra Reddy: question 3");

//Implicit type casting
        System.out.println("Implicit type casting");
        Sports sport = new Cricket();
        sport.totalMembersPlayed();

//Explicit type casting
        System.out.println("After explicit type casting");
        Cricket cricket = (Cricket) sport;
        cricket.totalMembersPlayed();

    }

}
