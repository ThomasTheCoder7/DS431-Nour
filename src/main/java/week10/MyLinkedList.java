/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import javax.swing.*;

class MyLinkedList {


    /********************************
     * 1 - Go to the index    "DONE"*
     * 2- shift the index     "DONE"*
     * 3- insert the index    "DONE"*
     * 4- Remove Duplicates   "DONE"*
     * 5- Check Unique        "DONE"*
     ********************************/





    Node first;
    int nElems;

    public void addFirst(int d) {
        Node newNode = new Node(d);
        newNode.next = first;
        first = newNode;
        nElems++;
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

    private void displayRec(Node n){
        if(n==null){return;}
        System.out.println(n);
        displayRec(n.next);

    }
    public  void displayRec(){
        displayRec(first);
    }
    private void displayRecRev(Node n){
        if(n==null){
            return;
        }else
        displayRecRev(n.next);
        System.out.println(n);

    }

    public void displayRecRev(){
        displayRecRev(first);
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
    private Node findRec(Node n,Node base){
        if(n == null){return null;}
        else if(base.data == n.data){return n;}
        else return findRec(n.next,base);
    }
    public Node findRec(Node n){
        return findRec(first,n);
    }
    public int sumRec(Node n){
        if(n == null){return 0;}
        return n.data+sumRec(n.next);
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

    private int maxRec(Node n,int m){
        if(n.next ==null){return m;}
        if(n.data >= m){
            n=n.next;
            m=maxRec(n,m);
        }
        else n=n.next;
        return maxRec(n,m);
    }
    public int maxRec(){
        return maxRec(first, first.data);
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

    public void RemoveD(Node n,Node k){
    if(k.next == null){return; } //if this is true it means we went through all the linked list
    if(n.next == null){n=k; k=k.next; }//if this is true n moved through the whole linked list and we reset it to k and moved k one position
    if(n.data == n.next.data){Node t = n.next; n.next=t.next;}//if this is true it deletes adjacent duplicated elements i.e 2,2,4,3,5
    if(n.data == k.data){k.next = n.next;}//if this is true it deletes duplicated elements
    RemoveD(n.next,k);
    }

    public void removeDuplicates(){
        Node n = first;
        Node c =first;
        Node prev_c;
        while(n != null){
            prev_c = c;
            c = n.next;
            while(c != null){
                if(n.data == c.data){
                    prev_c.next= c.next;
                }
                prev_c = c;
                c = c.next;
            }
            n=n.next;
        }
    }//Remove Dup


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
