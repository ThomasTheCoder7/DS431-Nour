package week10;

public class StackLinkedList {
   private int nElems=0;
   private LinkList mll;
    private int size;
   public StackLinkedList(int size){
        mll=new LinkList();
        this.size=size;
   }

   public void push(int j){
       if(nElems>=size){
           throw new ArrayIndexOutOfBoundsException();
       }
       mll.addFirst(j); nElems++;


   }
   public int pop (){
       if(isEmpty()){
        throw new ArrayIndexOutOfBoundsException();
       }
       Node n = mll.first;
       int k = n.getData();
       mll.RemoveFirst();
       nElems--;
       return k;
   }

   public boolean isEmpty(){return nElems==0;}
   public void display(){mll.display();}
}
