/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;
public class Circle {
    /*** The radius of the circle                                             */
     double radius = 1;
     
    /*** Construct a circle with a specified radius                           */
    public Circle(double newRadius) {
        radius = newRadius;
    }
    
    /*** Return radius                                                        */
    public double getRadius() {
        return radius;
    }
    /*** Set a new radius                                                     */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    /*** Return the area of this circle                                       */
    public double getArea() {
        return radius * radius * Math.PI;
    }
    /*** Return the string with radius and area of this circle                */
    public String toString() {
        String s = getRadius() + "\t\t" + getArea();
        return s;
    }
}
