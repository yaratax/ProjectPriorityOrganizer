

public class TreeNode<E> {
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

    @Override
        public String toString() {
            return element + " ";
        }
    }
     
