package week10;

public class ListOperations {
    /*******************
     *****TODO LIST*****
     * 1- Union*********
     * 2- Intersect*****
     * 3- difference
     *******************/
    static LinkList Union(LinkList list1, LinkList list2){
        LinkList l3 = new LinkList();
        LinkList l1 =list1;
        LinkList l2 =list2;
            l3.first=l1.first;
            l3.nElems= l1.nElems;
            Node n = l3.first;
            for(int i = 0;i<l3.nElems-1;i++){
                n=n.getNext();
            }
            l3.nElems = l1.nElems+l2.nElems;
            n.setNext(l2.first);
            int u = 1;
            if(l3.nElems<2){return l3;}
            l3.removeDuplicates();
            return l3;
    }//end union



    static LinkList Intersect(LinkList l1, LinkList l2){
        LinkList l3 = new LinkList();
        Node n = l1.first;
        Node n2= l2.first;
        while(n!=null){
            n2=l2.first;
            while (n2!=null){
                if(equalNode(n,n2)){l3.addFirst(n.getData());}
                n2=n2.getNext();
            }
            n=n.getNext();
        }

        l3.removeDuplicates();
        return l3;
    }//end Intersect



    static LinkList Difference(LinkList l1, LinkList l2){
        LinkList l3 = new LinkList();
        Node n1 = l1.first;
        Node n2;
        Node n3 = l3.first;

        boolean statement = true;
        while(n1!=null){
            n2=l2.first;
            while (n2!=null){
                if(n1.getData()==n2.getData()){statement=false; break;}
                n2=n2.getNext();
            }
            if(statement){
                if(l3.first==null){l3.addFirst(n1.getData()); n3=l3.first;}
                else{ n3.setNext(n1); n3 = n3.getNext();}
            }
            statement=true;
            n1=n1.getNext();
        }

        return l3;
    }


    public static boolean equalNode(Node n1,Node n2){return n1.getData()==n2.getData();}



}
