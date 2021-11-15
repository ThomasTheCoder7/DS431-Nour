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
public class ListIterator {
    LinkedList ll;
    Node current;
    int index;
    public ListIterator(LinkedList l){
        ll = l;
        current = l.getFirst();
        index =0;
    }
    public void reset(){
        current = ll.first;
        index=0;
        
    }
    
    public boolean hasNext(){
        if( current.getNext() == null)
            return false;
        else 
            return true;
                    
    }
      public Node getCurrent(){
        return current;
        
    }
      
      public Node next(){
          current = current.getNext();
          index++;
          return current;
      }
    
      
      public Node prev(){
          current = current.getPrev();
          index--;
          return current;
      }
      
      public int getIndex(){
          return index;
      }
}
