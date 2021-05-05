/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Raghavendra Reddy
 */
public class Question2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 2: Raghavendra Reddy");
        GeometricObject[] geometricObjects = new GeometricObject[5];

        geometricObjects[0] = new Square(6.3, true);
        geometricObjects[1] = new Square(7.3, false);
        geometricObjects[2] = new Square(5.6, false);
        geometricObjects[3] = new Square(8.0, true);
        geometricObjects[4] = new Square(7.5, true);

        for (GeometricObject geometricObject : geometricObjects) {
            System.out.println("Area: " + geometricObject.calculateArea());
            if (geometricObject.isColorable() == true) {
                Square square = (Square) geometricObject;
                square.howToColor();
            }
            System.out.println("**********************************");
        }

    }

}
