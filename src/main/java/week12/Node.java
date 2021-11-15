/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;
public class Node {
    private int data;
    private Node next;
    private Node prev;
    public Node(int d){
        data = d;
    }
    public String toString(){
        return "Node :" + data;
    }
    
    public void setData(int d){
        data = d;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node n){
        next = n;
    }
    public Node getNext(){
        return next;
    }
    public void setPrev(Node n){
        prev = n;
    }
    public Node getPrev(){
        return prev;
    }
}
