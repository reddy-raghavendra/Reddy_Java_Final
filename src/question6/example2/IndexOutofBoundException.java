/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6.example2;

/**
 *
 * @author Raghavendra Reddy
 */
public class IndexOutofBoundException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numbers[] = {1, 2, 3, 4, 5};
        System.out.println(numbers[10]);
    }

}
