/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author mk_no
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle c1 = new Circle(2.5);
        double cArea = c1.getArea();
        System.out.println(" Area of c1 is "+ cArea);
        System.out.println(c1);
        Circle c2= c1;
        System.out.println(c2);
        c2.setRadius(1);
        System.out.println(c1);
        System.out.println(c2);
        
        
        
    }
    
}
