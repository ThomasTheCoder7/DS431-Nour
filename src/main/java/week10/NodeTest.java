/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

public class NodeTest {

    public static void main(String[] args) {
        Node start = new Node(5);
        Node p = start;
        for (int i = 1; i < 4; i++) {
            p.setNext(new Node(2 * i));
            p = p.getNext();
        }
        p = start;
        while (p != null) {
            System.out.println(p);
            p = p.getNext();
        } // while loop
    } // main
} // class
