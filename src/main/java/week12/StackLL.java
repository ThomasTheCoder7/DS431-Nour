/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

/**
 *
 * @author mk_no
 */
public class StackLL {
    LinkedList ll;
    
    public StackLL(){
        ll = new LinkedList();
    }
    
   public  void push(int n){
        ll.insertFirst(n);
    }
   
   public Node pop(){
       return ll.deleteFirst();
   }
   public boolean isEmpty(){
       return ll.isEmpty();
   }
}
