/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10.example1;

/**
 *
 * @author Raghavendra Reddy
 */
public class CalculateSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question10: Raghavendra Reddy");
        System.out.println(add(20));
    }
    public static int add(int num){
        if (num == 1) {
            return 1;
        }else{
            return num + add(num);
        }
            
    }
    
}
