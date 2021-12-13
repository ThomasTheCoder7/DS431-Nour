package week10;

public class FirstLastLinkList extends LinkList {
    protected Node last;	// reference to last node

    /**
     * Constructor to create new empty List
     *
     */
    public FirstLastLinkList() {
        last = first;
    }

    /**
     * Insert element at index position in list
     * where (list is indexed from 0).
     * if(n.getNext()==null){n.setNext(new Node(0));}
     * @param index position in list
     * @param e   element to insert
     */
    public void insert(int index, int e) {
        Node n = first;
        Node a = new Node(e);
        for(int i = 0;i<index-1&&n.getNext()!=null;i++) {
            // There is two ways to add index which is bigger than nElems Either I had to make it fill with zeros until it reaches the desired index or make it put it in last if index > nElems
            n = n.getNext();       //go to index
        }
        if(first == null){first=a; last = first.getNext();}
        if(index == 0&&first!=null){first.setData(a.getData());}else
        n.setNext(a);//this is the insertion method
        if(index>=nElems){last=a;}
        nElems++;
    }

    public Node getLast(){
        Node n = first;
        while (n.getNext()!=null){n=n.getNext();}
        return n;
    }

    /**
     * delete element from specified position in list.
     *
     * @param   index position in list where item is to be removed
     * @return
     */
    public int deleteAt(int index) {
        Node n = first;
        Node p = null;
        int t;
        for(int i =0;i<index;i++){
            p=n;
            n=n.getNext();
        }
        if(p==null) {
            first = first.getNext();
            return first.getData();
        }else{
           t = n.getData();
            p.setNext(n.getNext());
            return t;}

    }
    /**
     * update element at specified position in list with new element
     *
     * @param   index  position of element to update
     * @param   e new element
     */
    public void set(int index, int e) {
        Node n = first,p=null;
        for(int i =0;i<index;i++){
            p=n;
            n=n.getNext();
        }
        n.setData(e);
    }
    /**
     * Return element at specified position in list.
     *
     * @param   index  postion in list
     * @return  element at postion specified by index
     */
    public int get(int index) {
        Node n = first;
        if(index>=nElems){index=nElems-1;}
        for(int i = 0;i<=index-1;i++) {
            n = n.getNext();       //go to index
        }
        return n.getData();
    }

}

