
public class BinaryTree<E> {
    public static class TreeNode<E> {
     public E element;
        public TreeNode<E> left;
        public TreeNode<E> right;
        public TreeNode<E> parent;
             
  public TreeNode(E elem) {
            element = elem;
            left = null;
            right = null;
	    parent=null;          
        }

        public String toString() {
            return element + " ";
        }
    }
     
     public TreeNode<E> Root;
      public int size;

    public BinaryTree() {
        Root = null;
        size = 0;
    }

    public boolean hasLeft(TreeNode<E> node) {
        return (node.left != null);
    }

    public boolean hasRight(TreeNode<E> node) {
        return (node.right != null);

    }
public int getSize() { return size; }

    public boolean isEmpty() { return size == 0;}

    public TreeNode<E> addRoot(E e) {
        if (!isEmpty()) 
            System.out.println("Invalid action: Tree is not empty");
        else
	{
        Root = new TreeNode<E>(e);
        size = 1;}
        return Root;
    }

    public TreeNode<E> search(TreeNode<E> root, E e, TreeNode<E> result) {
        if (root == null) {
            return null;
        }
        if (e == root.element) {
            return root;
        } else {
            if (root.left != null) {
                result = search(root.left, e, result);
            }

            if (root.right != null) {
                result = search(root.right, e, result);
            }

            return result;
        }

    }
 public void addLeft(E e, E p) {
        TreeNode<E> n = search(Root, p, null);
        if (n != null) 
	{
            if (n.left != null){ 
                System.out.println("parent already has a left child");}
            else
            {TreeNode<E> child = new TreeNode(e);
            n.left = child;
	    child.parent=n;
            size++;}
        } 
	else {
            System.out.println("parent does not exist");
        }
    }

    public void addRight(E e, E p) {
        TreeNode<E> n = search(Root, p, null);
        if (n != null) {
            if (n.right != null) {
                System.out.println("parent already has a left child");
            }
	    else{
            TreeNode<E> child = new TreeNode(e);
            n.right = child;
	    child.parent=n;
            size++;}
        } 
	else {
            System.out.println("parent does not exist");
        }
    }
    //---------------------------Print Useing InOrder -------------------------------- 
    public void inDisplay(TreeNode<E> Tree) {
        if (Tree != null) 
        {
            inDisplay(Tree.left);
            System.out.print("\n"+Tree);
            inDisplay(Tree.right);            
        }
    }
    //---------------------------Print Useing PreOrder -------------------------------- 
    public void PreDisplay(TreeNode<E> Tree) {
        if (Tree != null) 
        {  
            System.out.print("\n"+Tree);
            PreDisplay(Tree.left);
            PreDisplay(Tree.right);            
        }
    }
    //---------------------------Print Useing PostOrder -------------------------------- 
    public void PostDisplay(TreeNode<E> Tree) {

        if (Tree != null) 
        {
            PostDisplay(Tree.left);
            PostDisplay(Tree.right);   
            System.out.println(Tree);
            System.out.print("\nRight Child "+Tree.right);                       
        }
    }
    
    public void printallPost(TreeNode<E> Tree){
        if(Tree != null){
            printallPost(Tree.left);
            printallPost(Tree.right);
            System.out.println(Tree.element+"\t");
        }
    }
    
    public void printExternal(TreeNode<E> Tree){
        if(Tree != null){
            printallPost(Tree.left);
            if(Tree.left == null && Tree.right == null){
                 System.out.println(Tree.element+"\t");
            }
        }
            printallPost(Tree.right);
        }
   public void Mirror(TreeNode<E> Tree){
       // Recursive methode 
       TreeNode<E> right = Tree.right;
       TreeNode<E> left = Tree.left;
       Tree.left = right;
       Tree.right = left;
       Mirror(Tree.left);
       Mirror(Tree.right);
       
              
   }
}
