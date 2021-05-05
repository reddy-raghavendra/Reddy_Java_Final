/*;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Raghavendra Reddy
 */
public class ComparableCircle extends Circle implements
        Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle obj) {
        return Double.compare(super.getArea(), obj.getArea());
    }

}
