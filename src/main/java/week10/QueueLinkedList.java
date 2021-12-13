package week10;

public class QueueLinkedList {
    private LinkList linkedList;
    private int nElems,size;
    public QueueLinkedList(int size){
        this.size = size;
        linkedList=new LinkList();
    }
    public void enqueue(int x){
        if(isFull()){throw new ArrayIndexOutOfBoundsException();}
        linkedList.addLast(x);
        nElems++;
    }
    public int dequeue(){
        if(isEmpty()){throw new ArrayIndexOutOfBoundsException();}
        int x = linkedList.first.getData();
        linkedList.RemoveFirst();
        nElems--;
        return x;
    }
    public boolean isEmpty(){
        return nElems<=0;
    }
    public boolean isFull(){
        return nElems>=size;
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }
}
