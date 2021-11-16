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
            l3.nElems= l1.nElems;
            Node n = l3.first;
            for(int i = 0;i<l3.nElems-1;i++){
                n=n.next;
            }
            l3.nElems = l1.nElems+l2.nElems;
            n.next = l2.first;
            int u = 1;
            if(l3.nElems<2){return l3;}
            Node a = l3.first;
            Node p = a;
            for(int i = l3.nElems-1;i>0;i--){
                p=a;
                for(int j = 0;j< l3.nElems-1;j++){
                    System.out.println(p);
                    if(equalNode(p,a))
                    {l3.DeleteNext(p);}
                    p=p.next;
                }
                a=a.next;
            }

            return l3;}//end union



    public static boolean equalNode(Node n1,Node n2){return n1.data==n2.data;}



}
