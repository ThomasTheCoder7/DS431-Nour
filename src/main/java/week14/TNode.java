// tree.java
// demonstrates binary tree
// to run this program: C>java TreeApp
package week14;

////////////////////////////////////////////////////////////////
class TNode
   {
   private int iData;              // data item (key)
   private TNode leftChild;         // this node's left child
   private TNode rightChild;        // this node's right child

      public int getiData() {
         return iData;
      }

      public void setiData(int iData) {
         this.iData = iData;
      }

      public TNode getLeftChild() {
         return leftChild;
      }

      public void setLeftChild(TNode leftChild) {
         this.leftChild = leftChild;
      }

      public TNode getRightChild() {
         return rightChild;
      }

      public void setRightChild(TNode rightChild) {
         this.rightChild = rightChild;
      }

      public void displayNode()      // display ourself
      {
      System.out.print('{');
      System.out.print(iData);
      System.out.print("} ");
      }
   }  // end class Node
////////////////////////////////////////////////////////////////
class TNodeString
{
   public String sData;
   public TNodeString leftChild;
   public TNodeString rightChild;

   public void displayNode()
   {
      System.out.print('{');
      System.out.print(sData);
      System.out.print('}');
   }

}  // end class Node
////////////////////////////////////////////////////////////////

class TNodeGeneric <T>{
   public T TData;
   public TNodeGeneric leftChild;
   public TNodeGeneric rightChild;

   public void displayNode()
   {
      System.out.print('{');
      System.out.print(TData);
      System.out.print('}');

   }


}  // end class Node
 ////////////////////////////////////////////////////////////////