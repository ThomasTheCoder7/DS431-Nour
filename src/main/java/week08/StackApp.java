/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week08;
class StackApp {
    public static void main(String[] args) {
        StackArray theStack = new StackArray(10);  // make new stack
        theStack.push(20);               // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        while (!theStack.isEmpty()) {     // until it's empty,
            long value = theStack.pop(); // delete item from stack                                      
            System.out.print(value);      // display it
            System.out.print(" ");
        }  // end while
        System.out.println("");
    }  // end main()
}  // end class StackApp
