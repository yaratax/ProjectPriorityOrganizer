

public class LLstack<E> {



public class Node<E> {
    //-------------------------------- Node Class --------------------------------------- 

        private E element; // reference to the element stored at this node
        private Node<E> next; // reference to the subsequent node in the list

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public Node() {
                   element = null;
                   next = null;
               }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

        public void setelement(E element) {
            this.element = element;
        }
    }
   

    private Node<E> top;   // reference to the head node 
    private int size;   // number of elements in the LLstack 

    public LLstack() {   // constructs an empty LLstack
        top = null;
        size = 0;    }

    public int size() {    return size;    }
    public boolean isEmpty() {        return size == 0;    }

    public E top() {
        if (isEmpty()) {
            return null;
        }
        return top.getElement();
    }

    public void push(E elem) {
        Node<E> v = new Node<E>(elem, top);   // create and link-in a new node 
        top = v;
        size++;
    }

    public E pop() {
        if (isEmpty())   return null;
        E temp = top.getElement();
        top = top.getNext();   // link-out the former top node 
        size--;
        return temp;
    }
    //------------------------------- Search method ----------------------------------------
    public boolean Search( E key)
    {
                LLstack<E> temp = new LLstack<E>();
                E element;
                boolean result=false;
        while (!this.isEmpty()) {
            element=this.top();
            if (element.equals(key))
                result=true;
            temp.push(this.pop());
        }
                while (!temp.isEmpty()) {
            this.push(temp.pop());}
                return result;

    }
    //--------------------------------------------------------------------------------
//-------------------------------------- Display ---------------------------------------
    public void Display() 
    {
        LLstack<E> temp = new LLstack<E>();
        System.out.println("Top...> ");
        
        while (!this.isEmpty()) 
        {
            System.out.println("      "+this.top()+"\t");
            temp.push(this.pop());
        }
        
        while (!temp.isEmpty()) 
        {
            this.push(temp.pop());
        }
        
       System.out.println(" <... bottom");

    }
    
    public LLstack<E> MergeDistinct(LLstack<E> stack1,LLstack<E> stack2){
        LLstack<E> result = new LLstack<>();
        if(!stack1.isEmpty()){
            result.push(stack1.pop());
        }
        if(!stack2.isEmpty()){
            result.push(stack2.pop());
        }
        return result;
    }
    
}// End Class

