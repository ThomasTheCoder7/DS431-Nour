/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

class Node {
    int data;
    Node next;
   public Node(int data) {
        this.data = data;
    }
    public String toString() {
        return "Node " + data;
    }
    public boolean equals(Node t){
       return this.data == t.data;
    }
}
