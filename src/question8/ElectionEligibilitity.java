/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Raghavendra Reddy
 */
public class ElectionEligibilitity {

    public static void main(String[] args) throws ArithmeticException,
            NullPointerException {
        System.out.println("Answer for question 8: Raghavendra Reddy");
        Election ele = new Election("John Wick");
        ele.setAge(35);
        System.out.println(ele);
        
        Election ele1 = new Election("Naruto Uzumaki");
        ele1.setAge(20);
        
        Election ele2 = null;
        ele2.setAge(20);
    }
}
