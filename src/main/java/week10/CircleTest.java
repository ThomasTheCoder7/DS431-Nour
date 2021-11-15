/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Arrays;

public class CircleTest {

    /**
     * Main method
     */
    public static void main(String[] args) {
        int x , y ;
        x = 10 ;
        y = 20;
        
        System.out.println("x is "+ x);
        System.out.println("y is "+ y);
        
        x = y ;
        System.out.println("x is "+ x);
        System.out.println("y is "+ y);
        
        x= 13;
        System.out.println("x is "+ x);
        System.out.println("y is "+ y);
        
        
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);
        System.out.println("c1 is "+ c1);
        System.out.println("c2 is "+ c2);
        c1 = c2;
        System.out.println("c1 is "+ c1);
        System.out.println("c2 is "+ c2);
        c1.setRadius(5);
        System.out.println("c1 is "+ c1);
        System.out.println("c2 is "+ c2);
        
        int[] a ={1,2,3};
        int[] b= {3,10,55,12,71};
        System.out.println("a is " + Arrays.toString(a));
        System.out.println("b is " + Arrays.toString(b));
        a=b;
        System.out.println("a is " + Arrays.toString(a));
        System.out.println("b is " + Arrays.toString(b));
        a[0]=5;
        b[1]=20;
        System.out.println("a is " + Arrays.toString(a));
        System.out.println("b is " + Arrays.toString(b));
                

    }

}
