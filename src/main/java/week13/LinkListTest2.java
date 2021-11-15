/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import week12.LinkedList;
import week12.ListIterator;
import week12.Node;
import week12.StackLL;
import java.util.Random;

     
/**
 *
 * @author mk_no
 */
public class LinkListTest2 {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Random r = new Random();
        
      for(int i=0;i<10000;i++){
        ll.insert(r.nextInt());
      }
        ListIterator it = ll.getIterator();
        
        double startTime = System.nanoTime();
        for(int i=0;i<10000;i++){
        ll.retrieve(i);
        }
        double endTime = System.nanoTime();
        
        System.out.println("Without iter "+(endTime-startTime)/1000);
        System.out.println("===================== using iterator=============");
        startTime = System.nanoTime();
        for(int i=0;i<10000;i++){
        ll.retriveIter(i);
        }
        endTime = System.nanoTime();
        System.out.println("With iter "+(endTime-startTime)/1000);
        
    }
//    
}
