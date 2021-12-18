/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

class Node {
   private int data;
    private Node next;
   public Node(int data) {
        this.data = data;
    }
    public String toString() {
        return "Node " + data;
    }
    public boolean equals(Node t){
       return this.data == t.data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {this.next = next;}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
