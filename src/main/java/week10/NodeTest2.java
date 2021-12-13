/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import week12.LinkedList;

/**
 *
 * @author mk_no
 */
public class NodeTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("List by Add First");
        LinkList mLL = new LinkList();
        for (int i = 1; i < 5; i++) {
            mLL.addLast(i);
        }
        //Recursion
        FirstLastLinkList ff = new FirstLastLinkList();
        ff.insert(0,3);
        ff.insert(1,2);
        ff.insert(2,4);
        ff.insert(0,6);
        ff.insert(3,99);
        ff.insert(5,23);
        ff.insert(100,3);
        ff.display();

        System.out.println("LAST ---> "+ff.last);



    }



}
