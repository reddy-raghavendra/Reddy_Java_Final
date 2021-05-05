/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.example1;

import question1.example1.Fruit;
import question1.example1.Citrus;

/**
 *
 * @author Raghavendra Reddy
 */
public class Orange implements Fruit, Citrus {

    @Override
    public double sourPercentage() {
        return 20;
    }

    @Override
    public void nutrients() {
        System.out.println("Oranges contains vitamin A, vitamin C,\ncalcium,"
                + " protien, sugar, fiber");
    }

    @Override
    public void containSeeds() {
        System.out.println("Oranges contains multiple seeds");
    }    
    
}
