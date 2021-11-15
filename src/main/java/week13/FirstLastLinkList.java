/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;


/**
 * @(#) FirstLastLinkedList.java
 */

import java.lang.IndexOutOfBoundsException;
import week12.*;

/**
 * Implements a Double Ended List ADT Using a Dynamic LinkedList 
 * Implementation. Being double ended means inserting, updating
 * and retrieving elements at end of list can be implemented 
 * more efficiently.
 *
 * 
 */

public class FirstLastLinkList extends LinkedList {  
  protected Node last;	// reference to tail node

  /**
   * Constructor to create new empty List
   *
   */
  public FirstLastLinkList() {
   // call superclass constructor and initialise tail.
   super();
  }
    public void insert(int n) {
        Node temp = new Node(n);
        if (getFirst() == null) {
            setFirst(temp);
            last = temp;
        } else {

        last.setNext(temp);
      //  last.setPrev(last);
        last = last.getNext();
        }
    }

  /**
   * Insert element at index position in list 
   * where (list is indexed from 0). 
   *
   * @param index position in list
   * @exception IndexOutOfBoundsException if index out of bounds
   */
  public void insert(int index, Node n)  {
    // provide implementation of insert which can utilise tail
    // if element is to be inserted at end of list
    int counter =0;
    Node current=getFirst();
    Node prev = current;
    while(current != null && counter <index){
        prev = current;
        current = current.getNext();
        counter++;
        if(counter == index){
            prev.setNext(n);
            n.setNext(current);
        }
        
    }// while 
    if(current ==null){
        last.setNext(n);
        last = last.getNext();
    }
  }// insert
    

  /**
   * Remove element from specified position in list. 
   * tail node no use here as we need to locate the
   * node prior to that being deleted.
   *
   * @param   index position in list where item is to be removed 
   * @exception   IndexOutOfBoundsException  thrown if index out of bounds
   */
  public void remove(int index)  {
    // provide implementation of remove which can utilise tail
    // if element is to be removed from end of list
  }	
	

  /**
   * update element at specified position in list with new element
   *
   * @param   index  position of element to update
   *
   * @exception   IndexOutOfBoundsException thrown if index out of bounds
   */
  public void update(int index, Node n)  {
    // provide implementation of update which can utilise tail
    // if element to be updated is at end of list
    int counter =0;
    Node current=getFirst();
    Node prev = current;
    while(current != null && counter <index){
        prev = current;
        current = current.getNext();
        counter++;
        if(counter == index){
            current.setData(n.getData());
        }
        
    }// while 
    if(current ==null){
        last.setNext(n);
        last = last.getNext();
    }// if
    
    
  }	


  /**
   * Return element at specified position in list.
   *
   * @param   index  postion in list
   * @return  element at postion specified by index     
   * @exception   IndexOutOfBoundsException thrown if index out of bounds
   */
  public Node retrieve(int index)  {
    // provide implementation of retrieve which can utilise tail
    // if element is to be retrieved from end of list
    Node current = getFirst();
    int counter =0;
    while(current != null && counter < index ){
        counter ++;
        current = current.getNext();
    }
    if(counter == index){
        return current;
    }
    else{
        return null;
    }
    
  }

   public Node retrieveIter(int index)  {
    // provide implementation of retrieve which can utilise tail
    // if element is to be retrieved from end of list
    ListIterator it = getIterator();
    int counter =0;
    while(it.hasNext() && counter < index ){
        counter ++;
        it.next();
    }
    if(counter == index){
        return it.getCurrent();
    }
    else{
        return null;
    }
    
  }
  
}
  
