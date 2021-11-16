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
public class NodeTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("List by Add First");
        MyLinkedList mLL = new MyLinkedList();
        for (int i = 1; i < 5; i++) {
            mLL.addFirst(i);
        }
        Node a = mLL.first;
        MyLinkedList l2 = new MyLinkedList();
        l2.addFirst(3);
        l2.addFirst(9);
        MyLinkedList l3=new MyLinkedList();

        l3 = ListOperations.Union(mLL,l2);
        l3.display();




    }



}
