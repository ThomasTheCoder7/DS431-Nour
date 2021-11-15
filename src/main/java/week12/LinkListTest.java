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
public class LinkListTest {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(3);
        ll.insert(2);
        ll.insert(6);
        ll.insert(5);
//        
//        
        ll.display();
        System.out.println("Sum is:" + ll.sum());
        System.out.println("Max:" + ll.max());
        System.out.println("Max:" + ll.min());
        System.out.println("Average:" + ll.average());

        System.out.println("The list has unique elements:" + ll.isUnique());
        ll.insert(2);
        ll.display();
        System.out.println("The list has unique elements:" + ll.isUnique());

        System.out.println("is the number 5 in the list " + ll.find(5));
        System.out.println("is the number 13 in the list " + ll.find(13));

        ll.deleteFirst();
        ll.display();
        ll.insertFirst(10);
        ll.insertFirst(12);
        ll.insertFirst(7);
        ll.deleteFirst();
        ll.deleteFirst();
        ll.display();

        ListIterator iter = ll.getIterator();
        iter.reset();
        Node c = iter.getCurrent();
        c.setData(c.getData() + 10);
        while (iter.hasNext()) {
            c = iter.next();
            c.setData(c.getData() + 10);
        }

        ll.display();

        StackLL stack = new StackLL();
        stack.push(7);
        stack.push(17);
        stack.push(70);
        stack.push(3);
        stack.push(55);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
//    
}
