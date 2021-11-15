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
public class LinkedList {

    Node first;
    //Node last;
    ListIterator iter;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node n) {
        first = n;
    }

    public LinkedList() {
        first = null;
        iter = new ListIterator(this);
    }

    public void insert(int index, Node n) {
        int counter = 0;
        Node current = getFirst();
        Node prev = current;
        while (current != null && counter < index) {
            prev = current;
            current = current.getNext();
            counter++;
            if (counter == index) {
                prev.setNext(n);
                n.setNext(current);
            }

        }// while 

    }

    public void remove(int index) {

    }

    public void update(int index, Node n) {
        int counter = 0;
        Node current = getFirst();
        Node prev = current;
        while (current != null && counter < index) {
            prev = current;
            current = current.getNext();
            counter++;
            if (counter == index) {
                current.setData(n.getData());
            }

        }

    }

    public Node retrieve(int index) {
         // provide implementation of retrieve which can utilise tail
    // if element is to be retrieved from end of list
    Node current = getFirst();
    int counter =0;
    while(current != null && counter < index ){
        counter ++;
        current = current.getNext();
    }
  //  System.out.println("Counter "+counter);
    if(counter == index){
        return current;
    }
    else{
        return null;
    }
    }

    public Node retriveIter(int index) {

        // provide implementation of retrieve which can utilise tail
        // if element is to be retrieved from end of list
        ListIterator it = getIterator();
        int counter = 0;
        if(index <it.getIndex())
            it.reset();
        else
            counter =index;
        while (it.hasNext() && counter < it.getIndex()) {
            counter++;
            it.next();
        }
        
      //  System.out.println("Counter " + (counter-index));
        if (counter == index) {
            Node n = it.getCurrent();
            it.next();
            return n;
        } else {
            return null;
        }

    }

    public int indexOf(Node n) {
        Node current = first;
        int counter = 0;
        while (current != null) {
            if (current.getData() == n.getData()) {
                return counter;
            }

            current = current.getNext();
        }// while

        return -1;
    }
//    public Node getLast(){
//        return last;
//    } 
//    

    public ListIterator getIterator() {
        if(iter.getCurrent()==null)
            iter.reset();
        return iter;
    }
// insert a new node at the end of the list    

    public void insert(int n) {
        Node temp = new Node(n);
        if (first == null) {
            first = temp;

        } else {
            Node current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temp);
        }
    }

    public int sum() {
        Node current = first;
        int s = 0;
        while (current != null) {
            s = s + current.getData();
            current = current.getNext();
        }
        return s;
    }

    public void display() {

        System.out.println("===================================");
        Node current = first;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
        System.out.println("===================================");
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.getNext();
        temp.setNext(null);

        return temp;
    }

    public void insertFirst(int n) {
        Node temp = new Node(n);
        temp.setNext(first);
        first = temp;
    }
//    public Node deleteLast(){
//        
//    }

    public int max() {
        if (first == null) {
            return Integer.MIN_VALUE;
        }// if

        int m = first.getData();
        Node current = first;
        while (current != null) {
            if (m < current.getData()) {
                m = current.getData();
            }//if

            current = current.getNext();
        }// while 

        return m;
    }

    public int min() {
        if (first == null) {
            return Integer.MAX_VALUE;
        }// if

        int m = first.getData();
        Node current = first;
        while (current != null) {
            if (m > current.getData()) {
                m = current.getData();
            }//if

            current = current.getNext();
        }// while 

        return m;
    }

    public double average() {
        int s = 0;
        int counter = 0;
        Node current = first;
        while (current != null) {
            s = s + current.getData();
            counter++;

            current = current.getNext();
        }

        double a = (double) s / counter;
        return a;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isUnique() {
        Node current = first;
        while (current.getNext() != null) {
            Node element = current.getNext();
            while (element != null) {
                if (element.getData() == current.getData()) {
                    return false;
                }//if
                element = element.getNext();
            }// while element
            current = current.getNext();
        }// while current
        return true;
    }// isUnique

    public boolean find(int key) {
        Node current = first;
        while (current != null) {
            if (current.getData() == key) {
                return true;
            }

            current = current.getNext();
        }// while
        return false;
    }

}
