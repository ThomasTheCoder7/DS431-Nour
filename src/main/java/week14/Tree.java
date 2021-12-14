package week14;
class Tree{
   private TNode root;             // first node of tree

// -------------------------------------------------------------
   public Tree()                  // constructor
      { root = null; }            // no nodes in tree yet
// -------------------------------------------------------------
   public void insert(int id)
      {
      TNode newNode = new TNode();    // make new node
      newNode.setiData(id);           // insert data
      if(root==null)                // no node in root
         root = newNode;
      else                          // root occupied
         {
         TNode current = root;       // start at root
         TNode parent;
         while(true)                // (exits internally)
            {
            parent = current;
            if(id < current.getiData())  // go left?
               {
               current = current.getLeftChild();
               if(current == null)  // if end of the line,
                  {                 // insert on left
                  parent.setLeftChild(newNode);
                  return;
                  }
               }  // end if go left
            else                    // or go right?
               {
               current = current.getRightChild();
               if(current == null)  // if end of the line
                  {                 // insert on right
                  parent.setRightChild(newNode);
                  return;
                  }
               }  // end else go right
            }  // end while
         }  // end else not root
      }  // end insert()
// -------------------------------------------------------------
   public boolean delete(int key) // delete node with given key
      {                           // (assumes non-empty list)
      TNode current = root;
      TNode parent = root;
      boolean isLeftChild = true;

      while(current.getiData() != key)        // search for node
         {
         parent = current;
         if(key < current.getiData())         // go left?
            {
            isLeftChild = true;
            current = current.getLeftChild();
            }
         else                            // or go right?
            {
            isLeftChild = false;
            current = current.getRightChild();
            }
         if(current == null)             // end of the line,
            return false;                // didn't find it
         }  // end while
      // found node to delete

      // if no children, simply delete it
      if(current.getLeftChild()==null && current.getRightChild()==null)
         {
         if(current == root)             // if root,
            root = null;                 // tree is empty
         else if(isLeftChild)
            parent.setLeftChild(null);     // disconnect
         else                            // from parent
            parent.setRightChild(null);
         }

      // if no right child, replace with left subtree
      else if(current.getRightChild()==null)
         if(current == root)
            root = current.getLeftChild();
         else if(isLeftChild)
            parent.setLeftChild(current.getLeftChild());
         else
            parent.setRightChild(current.getLeftChild());

      // if no left child, replace with right subtree
      else if(current.getLeftChild()==null)
         if(current == root)
            root = current.getRightChild();
         else if(isLeftChild)
            parent.setLeftChild(current.getRightChild());
         else
            parent.setRightChild(current.getRightChild());

      else  // two children, so replace with inorder successor
         {
         // get successor of node to delete (current)
         TNode successor = getSuccessor(current);

         // connect parent of current to successor instead
         if(current == root)
            root = successor;
         else if(isLeftChild)
            parent.setLeftChild(successor);
         else
            parent.setRightChild(successor);

         // connect successor to current's left child
         successor.setLeftChild(current.getLeftChild());
         }  // end else two children
      // (successor cannot have a left child)
      return true;                                // success
      }  // end delete()

// -------------------------------------------------------------
   // returns node with next-highest value after delNode
   // goes to right child, then right child's left descendents
   private TNode getSuccessor(TNode delNode)
      {
      TNode successorParent = delNode;
      TNode successor = delNode;
      TNode current = delNode.getRightChild();   // go to right child
      while(current != null)               // until no more
         {                                 // left children,
         successorParent = successor;
         successor = current;
         current = current.getLeftChild();      // go to left child
         }
                                           // if successor not
      if(successor != delNode.getRightChild())  // right child,
         {                                 // make connections
         successorParent.setLeftChild(successor.getRightChild());
         successor.setRightChild(delNode.getRightChild());
         }
      return successor;
      }
// -------------------------------------------------------------
   public TNode find(int key)      // find node with given key
      {                           // (assumes non-empty tree)
      TNode current = root;               // start at root
      while(current != null)        // while no match,
         {
        if(current.getiData() == key)             // if no child,
            return current;               // found it
         if(key < current.getiData())         // go left?
            current = current.getLeftChild();
         else                            // or go right?
            current = current.getRightChild();
         }
      return null;         // didn't find it
      }  // end find()

      private TNode findRec(int key,TNode localRoot){
      if(localRoot!=null){
         if(localRoot.getiData()==key){return localRoot;}
         if(localRoot.getiData()<key){ return findRec(key,localRoot.getRightChild());}
         if(localRoot.getiData()>key){return findRec(key,localRoot.getLeftChild());}
      }
      return  localRoot;
      }
   // -------------------------------------------------------------
      public TNode findRec(int key){ return findRec(key,root); }
   // -------------------------------------------------------------

// -------------------------------------------------------------
   public void traverse(int traverseType)
      {
      switch(traverseType)
         {
         case 1: System.out.print("\nPreorder traversal: ");
                 preOrder(root);
                 break;
         case 2: System.out.print("\nInorder traversal:  ");
                 inOrder(root);
                 break;
         case 3: System.out.print("\nPostorder traversal: ");
                 postOrder(root);
                 break;
         case 4: System.out.print("\nLevelorder traversal: ");
                 levelOrder();
                 break;
         }
      System.out.println();
      }
// -------------------------------------------------------------
   private void preOrder(TNode localRoot) {
      if(localRoot != null){
      System.out.print(localRoot.getiData()+" ");
      preOrder(localRoot.getLeftChild());
      preOrder(localRoot.getRightChild());
      }
      }
// -------------------------------------------------------------
   private void inOrder(TNode localRoot)
      {
      if(localRoot != null)
         {
         inOrder(localRoot.getLeftChild());
         System.out.print(localRoot.getiData() + " ");
         inOrder(localRoot.getRightChild());
         }
      }
// -------------------------------------------------------------
   private void postOrder(TNode localRoot)
      {
         if(localRoot != null){
            postOrder(localRoot.getLeftChild());
            postOrder(localRoot.getRightChild());
            System.out.print(localRoot.getiData()+" ");
         }
      }
// -------------------------------------------------------------
   public void levelOrder() {

         }
// -------------------------------------------------------------
   private int findMin(TNode n,int m){
      if(n.getLeftChild() == null){ return m;}
      return findMin(n.getLeftChild(),n.getLeftChild().getiData());
   }

   public int findMin(){
      return findMin(root,0);

   }
// -------------------------------------------------------------
public int findMinIter(){
      TNode n = root;
      while(n.getLeftChild() != null){
         n=n.getLeftChild();
      }
      return n.getiData();
}
// -------------------------------------------------------------
private int findMax(TNode n,int m){
      if(n.getRightChild()==null)return m;
      else return findMax(n.getRightChild(),n.getRightChild().getiData());
}
public int findMax(){
      return findMax(root,0);
}
// -------------------------------------------------------------
public int findMaxIter(){
   TNode n = root;
   while(n.getRightChild() != null){
      n=n.getRightChild();
   }
   return n.getiData();
}
// -------------------------------------------------------------



















}  // end class Tree
