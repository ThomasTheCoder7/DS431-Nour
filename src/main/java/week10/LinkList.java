/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.Random;

class LinkList {


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
        newNode.setNext(first);
        first = newNode;
        nElems++;
    }



    public void addLast(int d) {

        if (first == null) {
            first = new Node(d);

        } else {
            Node p = first;
            Node newNode = new Node(d);

            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(newNode);
        }
        nElems++;
    }

    public void display() {
        Node p = first;
        while (p != null) {
            System.out.println(p);
            p = p.getNext();
        }
    }

    private void displayRec(Node n){
        if(n==null){return;}
        System.out.println(n);
        displayRec(n.getNext());

    }
    public  void displayRec(){
        displayRec(first);
    }
    private void displayRecRev(Node n){
        if(n==null){
            return;
        }else
        displayRecRev(n.getNext());
        System.out.println(n);

    }

    public void displayRecRev(){
        displayRecRev(first);
    }
    public int sum() {
        int s = 0;
        Node p = first;
        while (p != null) {
            s += p.getData();
            p = p.getNext();
        }
        return s;
    }
    private Node findRec(Node n,Node base){
        if(n == null){return null;}
        else if(base.getData() == n.getData()){return n;}
        else return findRec(n.getNext(),base);
    }
    public Node findRec(Node n){
        return findRec(first,n);
    }
    public int sumRec(Node n){
        if(n == null){return 0;}
        return n.getData()+sumRec(n.getNext());
    }


    public int max() {
        int m = first.getData();
        Node p = first;
        while (p != null) {
            if (m < p.getData()) {
                m = p.getData();
            }
            p = p.getNext();
        }
        return m;
    }

    private int maxRec(Node n,int m){
        if(n.getNext() ==null){return m;}
        if(n.getData() >= m){
            n=n.getNext();
            m=maxRec(n,m);
        }
        else n=n.getNext();
        return maxRec(n,m);
    }
    public int maxRec(){
        return maxRec(first, first.getData());
    }

    public boolean find(int searchKey) {
        Node p = first;
        while (p != null) {
            if (searchKey == p.getData()) {
                return true;
            }
            p = p.getNext();
        }

        return false;
    }

    public double avg(){
        Node n = first;
        double len = 0.0;

        while(n!=null){
            len++;
            n=n.getNext();
        }

        return sum()/len;
    }//end avg

    public int range(){
        int r = 0;
        return r;
    }//end range

    public int getMin(){
        Node n = first;
        int min=first.getData();
        while (n.getNext() != null){
            n=n.getNext();
            if(n.getData()<min){
                min = n.getData();
            }
        }
  return  min;  }
    public int getMinIndex(){
        Node n = first;
        int index=1,minIn=0;
        int min=first.getData();
        while (n.getNext() != null){
            n=n.getNext();
            if(n.getData()<min){
                min = n.getData();
                minIn=index;
            }
            index++;
        }
        return  minIn;  }
    public int getMax(){
        Node n = first;
        int max=first.getData();
        while (n.getNext() != null){
            n=n.getNext();
            if(n.getData()>max){
                max = n.getData();
            }
        }
    return max;
    }
    public int getMaxIndex(){
        Node n = first;
        int index=1,maxIn=0;
        int max=first.getData();
        while (n.getNext() != null){
            n=n.getNext();
            if(n.getData()>max){
                max = n.getData();
                maxIn=index;
            }
            index++;
        }
        return maxIn;
    }

    public void RemoveFirst(){ first = first.getNext(); }
    public void RemoveLast(){
        Node n = first;
    for(int i = 0;i<nElems;i++){
        n=n.getNext();
    }
        n = null;
        nElems--;
    }
    public int size(){return nElems;}

    public int deleteAt(int index){
        Node n = first;
        Node p = null;
        int t=0;
        for(int i =0;i<index;i++){
            p=n;
            n=n.getNext();
        }
        if(p==null) {
            first = first.getNext();
            return first.getData();
        }else
        p.setNext(n.getNext());
        return n.getData();
    }//End deleteAt

    public void SetAt(int index, Node a){
        Node n = first,p=null;
        for(int i =0;i<index;i++){
            p=n;
            n=n.getNext();
        }
        n.setData(a.getData());
    }

    public void removeDuplicates(){
        Node n = first;
        Node c =first;
        Node prev_c;
        while(n != null){
            prev_c = n;
            c = n.getNext();
            while(c != null){
                if(n.getData() == c.getData()){
                    prev_c.setNext(c.getNext());
                    c.setNext(null);
                    c= prev_c.getNext();
                }
                else{
                    prev_c = c;
                    c = c.getNext();
                }
            }
            n=n.getNext();
        }
    }//Remove Dup


    public void insertAt(int index,Node a){
        Node n = first,p=n;
        for(int i = 0;i<index-1;i++) {
            n = n.getNext();       //go to index
        }
        a.setNext(n.getNext());         //next element is the element I want to shift
        n.setNext(a);            //this is the insertion method
    }

    public Node getAt(int index){
        Node n = first;
        if(index>=nElems){index=nElems-1;}
        for(int i = 0;i<=index-1;i++) {
            n = n.getNext();       //go to index
        }
        return n;
    }


    public boolean isEmpty() {
        return nElems<=0;
    }

    public void setFirst(Node newLink) {
        RemoveFirst();
        addFirst(newLink.getData());
    }

    public Node getFirst() {
        return first;
    }

    public boolean CheckOrderd(){
        Node n = first;
        while (n.getNext()!=null){
            if(n.getData()>n.getNext().getData()){return false;}
            n=n.getNext();
        }
        return true;
    }

    public boolean CheckUnique(){
        Node n = first,p=first.getNext();
        while(n.getNext()!=null){
            p=n.getNext();
            while (p!=null){
                if(n.getData()==p.getData()){return false;}
                p=p.getNext();
            }
            n=n.getNext();
        }
        return true;
    }

    public int rank(int j){
        j--;
        LinkList temp = new LinkList();
        temp.first=first;
        temp.BubbleSort();
        return temp.getAt(j).getData();
    }

    public void BubbleSort(){
        Node n = first;
        Node p = first.getNext();

        while(n.getNext()!=null){
            while(p!=null){
                if(n.getData()>p.getData()){swap(n,p);}
                p=p.getNext();
            }
            n=n.getNext();
            p=n;
        }
    }
        public String std() {
            double mean = sum() / (0.0 + nElems);
            int s = 0;
            double div = 0;
            Node n = first;
            while (n != null) {
                s = s + (int) (Math.pow((n.getData() - mean), 2));
                n=n.getNext();
            }
                div = s/(nElems+0.0);
            return String.format("%.4f",Math.sqrt(div));
    }

    public void swap(Node a,Node b){
        int temp = a.getData();
        a.setData(b.getData());
        b.setData(temp);
    }

    public void clear(){
        nElems=0;
    }

    public void fillRandom(int size){
        Node n = first;
        int k = 0;
        Random r = new Random();
        first.setData(r.nextInt(1000)+1);
        while (k<=size){
            n.setNext(new Node(r.nextInt(1000)+1));
            n=n.getNext();
            k++;
        }
    }
}
