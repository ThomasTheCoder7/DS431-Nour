/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import javax.swing.*;

class MyLinkedList {

    Node first;
    int nElems;

    public void addFirst(int d) {
        Node newNode = new Node(d);
        newNode.next = first;
        first = newNode;
        nElems++;
    }

    public void DeleteNext(Node n){
        try{
        n.next = n.next.next;
        }
        catch (Exception e){}
    }

    public void addLast(int d) {

        if (first == null) {
            first = new Node(d);

        } else {
            Node p = first;
            Node newNode = new Node(d);

            while (p.next != null) {
                p = p.next;
            }
            p.next = newNode;
        }
        nElems++;
    }

    public void display() {
        Node p = first;
        while (p != null) {
            System.out.println(p);
            p = p.next;
        }
    }

    public int sum() {
        int s = 0;
        Node p = first;
        while (p != null) {
            s += p.data;
            p = p.next;
        }
        return s;
    }

    public int max() {
        int m = first.data;
        Node p = first;
        while (p != null) {
            if (m < p.data) {
                m = p.data;
            }
            p = p.next;
        }
        return m;
    }

    public boolean find(int searchKey) {
        Node p = first;
        while (p != null) {
            if (searchKey == p.data) {
                return true;
            }
            p = p.next;
        }

        return false;
    }

    public double avg(){
        Node n = first;
        double len = 0.0;

        while(n!=null){
            len++;
            n=n.next;
        }

        return sum()/len;
    }//end avg

    public int range(){
        int r = 0;
        return r;
    }//end range

    public int getMin(){
        Node n = first;
        int min=first.data;
        while (n.next != null){
            n=n.next;
            if(n.data<min){
                min = n.data;
            }
        }
  return  min;  }

    public int getMax(){     Node n = first;
        int max=first.data;
        while (n.next != null){
            n=n.next;
            if(n.data>max){
                max = n.data;
            }
        }
    return max;
    }

    public void RemoveFirst(){ first = first.next; }
    public void RemoveLast(){
        Node n = first;
    for(int i = 0;i<nElems;i++){
        n=n.next;
    }
        n = null;
        nElems--;
    }
    public int size(){return nElems;}

    public void deleteAt(int index){
        Node n = first;
        Node p = null;
        for(int i =0;i<index;i++){
            p=n;
            n=n.next;
        }
        if(p==null) {
            first = first.next;
        }else
        p.next = n.next;
    }//End deleteAt

    public void SetAt(int index, Node a){
        Node n = first,p=null;
        for(int i =0;i<index;i++){
            p=n;
            n=n.next;
        }
        n.data=a.data;
    }
    /********************************
     * 1 - Go to the index    "DONE"*
     * 2- shift the index     "DONE"*
     * 3- insert the index    "DONE"*
     ********************************/
    public void insertAt(int index,Node a){
        Node n = first,p=n;
        for(int i = 0;i<index-1;i++) {
            n = n.next;       //go to index
        }
        a.next = n.next;        //next element is the element I want to shift
        n.next=a;             //this is the insertion method
    }

    public Node getAt(int index){
        Node n = first;
        for(int i = 0;i<index-1;i++) {
            n = n.next;       //go to index
        }
        return n.next;
    }


}
