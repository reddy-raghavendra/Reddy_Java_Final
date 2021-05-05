/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Raghavendra Reddy
 */
public class BankDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Following are the objects created to illustrate equals ans hashcode
         */
        System.out.println("Answer for question 11: Raghavendra Reddy");
        Bank b1 = new Bank("American bank", 5.8);
        Bank b2 = new Bank("Bank of America", 6.0);
        Bank b3 = new Bank("American bank", 5.8);
        Bank b4 = b1;
        Bank b5 = new Bank("Bank of America", 6.0);

        System.out.println("********Objects created******");
        System.out.println("b1: \"American bank\", 5.8");
        System.out.println("b2: \"Bank of America\", 6.0");
        System.out.println("b3: \"American bank\", 5.8");
        System.out.println("b4 = b1");
        System.out.println("b5: \"Bank of America\", 6.0");

        /**
         * Here, checking the objects with equals method, this will invoke the
         * overrided method in the Bank class
         */
        System.out.println("**********.equals************");
        System.out.println("b1 equals b2: " + b1.equals(b2));
        System.out.println("b1 equals b3: " + b1.equals(b3));
        System.out.println("b2 equals b4: " + b2.equals(b4));
        System.out.println("b4 equals b5: " + b4.equals(b5));
        System.out.println("b2 equals b2: " + b2.equals(b5));

        /**
         * Comparing the object address with ==
         */
        System.out.println("**********==**********");
        System.out.println(b1 == b2);
        System.out.println(b1 == b3);
        System.out.println(b1 == b4);
        System.out.println(b4 == b5);
        System.out.println(b2 == b5);

        /**
         * printing the hashcodes of the objects, this will invoke the hashCode
         * method of Bank class
         */
        System.out.println("*******hashcode**********");
        System.out.println("b1: " + b1.hashCode());
        System.out.println("b2: " + b2.hashCode());
        System.out.println("b3: " + b3.hashCode());
        System.out.println("b4: " + b4.hashCode());
        System.out.println("b5: " + b5.hashCode());

    }

}
