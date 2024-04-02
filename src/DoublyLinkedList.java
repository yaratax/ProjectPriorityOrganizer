
public class DoublyLinkedList<E> {

public class DllNode<E> {

    private E element; // reference to the element stored at this node
    private DllNode<E> next; // reference to the subsequent node in the list
    private DllNode<E> prev;

    public DllNode(E e, DllNode<E> p, DllNode<E> n) {
        element = e;
        prev = p;
        next = n;
    }

    public E getElement() {
        return element;
    }

    public DllNode <E> getPrev() {
        return prev;
    }

    public DllNode<E> getNext() {
        return next;
    }
     public void setPrev(DllNode<E> p) {
        prev = p;
    }

    public void setNext(DllNode<E> n) {
        next = n;
    }
}

    DllNode<E> header; // head node of the list (or null if empty)
    DllNode<E> trailer; // last node of the list (or null if empty)
    private int size = 0; // number of nodes in the list

    public DoublyLinkedList() {// constructs an initially empty list
        header = new DllNode<>(null, null, null);
        trailer = new DllNode<>(null, header, null);
        header.setNext(trailer);
        size = 0;
    } // constructs an initially empty list
    // access methods

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() { // returns (but does not remove) the first element
        if (isEmpty()) {
            return null;
        }
        return header.getNext().getElement();
    }

    public E last() { // returns (but does not remove) the last element
        if (isEmpty()) {
            return null;
        }
        return trailer.getPrev().getElement();
    }

 

    private void addBetween(E e, DllNode<E> predecessor, DllNode<E> successor) {

        DllNode<E> newest = new DllNode<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    public void addFirst(E e) {

        addBetween(e, header, header.getNext());
    }

    public void addLast(E e) { // adds element e to the end of the list
        addBetween(e, trailer.getPrev(), trailer);

    }

    public E remove(DllNode<E> node) {
        DllNode<E> predecessor = node.getPrev();
        DllNode<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

    public E removeFirst() { // removes and returns the first element

        if (isEmpty()) {
            return null;
        }

        return remove(header.getNext());
    }

    public E removeLast() { // removes and returns the last element

        if (isEmpty()) {
            return null;
        }

        return remove(trailer.getPrev());
    

    }  
    public void Display()
    {
        DllNode temp= header.getNext();
         System.out.print(" header<->");
        while(temp!=null)
        {
           System.out.print(temp.getElement()+"<->");
           temp=temp.getNext();
        }
      System.out.print("tail");
    }        
    
}
