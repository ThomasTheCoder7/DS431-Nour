/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;
import week12.Node;

/**
 *
 * @author mk_no
 */
public class FirstLastLinkListTest {
    public static void main(String[] args){
        FirstLastLinkList fList = new FirstLastLinkList();
        fList.insert(5);
        fList.insert(15);
        fList.insert(20);
        fList.insert(3);
        fList.display();
        fList.insert(6, new Node(10));
        fList.display();
        fList.update(2, new Node(13));
        fList.display();
    }
    
}
