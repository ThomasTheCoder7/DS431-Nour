/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week08;

/**
 *
 * @author mk_no
 */
public class QueueApp {
    public static void main(String[] args) {
        QueueArray theQueue = new QueueArray(10);  // make new stack
        theQueue.enqueue(20);               // push items onto stack
        theQueue.enqueue(40);
        theQueue.enqueue(60);
        theQueue.enqueue(80);
        while (!theQueue.isEmpty()) {     // until it's empty,
            long value = theQueue.dequeue(); // delete item from stack                                      
            System.out.print(value);      // display it
            System.out.print(" ");
        }  // end while
        System.out.println("");
        
        int x = 9 * (8+12/20);  {int y=10;        int z = 20;};
          
    }  // end main()
}  // end class StackApp
