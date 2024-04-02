

public class LLQueue<E> {
        


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
   

   

    private Node<E> front;
    private Node<E> rear;
    private int size;

    public LLQueue() { // constructor
        front = null;
        rear = null;
        size = 0;
    }

    public Node<E> front() {
        return front;
    }

    public void setFront(Node<E> front) {
        this.front = front;
    }

    public Node<E> rear() {
        return rear;
    }

    public void setRear(Node<E> rear) {
        this.rear = rear;
    }

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() { // returns (but does not remove) the first element
        if (isEmpty()) {
            return null;
        }
        return front.getElement();
    }

    public E last() { // returns (but does not remove) the last element
        if (isEmpty()) {
            return null;
        }
        return rear.getElement();
    }

    public void Enqueue(E elem) {
        Node<E> newest = new Node<E>(elem, null);
        if (isEmpty()) {
            front = newest; // special case of a previously empty queue 
        } else {
            rear.setNext(newest); // add node at the tail of the list 
        }
        rear = newest; // update the reference to the tail node 
        size++;
    }

    public E Dequeue() {
        if (isEmpty()) {
            return null;
        }
        E answer = front.getElement();
        front = front.getNext();
        size--;
        if (size == 0) {
            rear = null; // the queue is now empty
        }
        return answer;
    } 
//-------------------------------------- Display -------------------------------------
 public void Display() {
        System.out.println("First.....>");
          for(int i=0;i<size;i++)
        {
           System.out.println("    "+first()+"\t");
           Enqueue(Dequeue());
        }  
           System.out.println("<........Last");
     }


}// End Class
