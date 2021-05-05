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
public class Square extends GeometricObject implements Colorable {

    private double side;

    public Square(double side, boolean colorable) {
        super(colorable);
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double calculateArea() {
        return Math.round(side * side * 100) / 100.0;
    }

}
