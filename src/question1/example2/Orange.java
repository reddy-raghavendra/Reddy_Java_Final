/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.example2;

/**
 *
 * @author Raghavendra Reddy
 */
public class Orange extends Fruit {

    @Override
    public void nutrients() {
        System.out.println("Oranges contains vitamin A, vitamin C,\ncalcium,"
                + " protien, sugar, fiber");
    }

    @Override
    public void containsSeeds() {
        System.out.println("Orange fruit contains seeds");
    }

}
