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
public interface Citrus {
    public boolean VITAMIN_C = true;
    
    public abstract double sourPercentage();
    
    public default void containSeeds(){
        System.out.println("Citrus fruits contains seeds");
    }
}
