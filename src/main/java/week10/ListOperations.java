package week10;

public class ListOperations {
    /*******************
     *****TODO LIST*****
     * 1- Union*********
     * 2- Intersect*****
     * 3- difference
     *******************/
    static MyLinkedList Union(MyLinkedList list1,MyLinkedList list2){
        MyLinkedList l3 = new MyLinkedList();
        MyLinkedList l1 =list1;
        MyLinkedList l2 =list2;
            l3.first=l1.first;
            Node n = l3.first;
            for(int i = 0;i<l3.nElems-1;i++){
                n=n.next;
            }
            n.next = l2.first;
            l3.display();







    return l3;
    }



    public static boolean equalNode(Node n1,Node n2){return n1==n2;}



}
