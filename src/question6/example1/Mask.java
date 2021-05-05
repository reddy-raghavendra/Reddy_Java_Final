/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6.example1;

/**
 *
 * @author Raghavendra Reddy
 */
public class Mask {

    private String maskType;
    private double price;

    public Mask(String maskType, double price) {
        this.maskType = maskType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mask{" + "maskType=" + maskType + ", price=" + price + '}';
    }

}
