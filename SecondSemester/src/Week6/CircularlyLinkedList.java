package Week6;

/**
 * Created by Khaled Jalal on 3/1/2021.
 */
public class CircularlyLinkedList<A> {
    private Node<A> tail ;
    private int size = 0 ;

    private boolean isEmpty()
    {
        return size==0;
    }

    public int Size()
    {
        return size;
    }

    public A First_Element()
    {
        if(isEmpty())  return null ;
        return tail.getNext().getElement();
    }

    public A Last_Element()
    {
        if(isEmpty())  return null ;
        return tail.getElement();
    }

    public void Add_First(A element)
    {
     if(isEmpty())
     {
         tail = new Node<A>(element,null) ;
         tail.setNext(tail);
     }
     else
     {
         Node<A> new_Node = new Node<A>(element, tail.getNext());
         tail.setNext(new_Node);
     }
     size++;
    }

    public void Add_Last(A element)
    {
        Add_First(element);
        tail = tail.getNext();
    }

    public A Remove_From_Begining()
    {
        if(isEmpty())
            return null ;
        Node<A> x = tail.getNext() ;
        if(x==null)
            tail=null ;
        else
            tail.setNext(x.getNext());
        size-- ;
        return x.getElement() ;
    }

    public void Rotate()
    {
        if(tail!=null)
            tail = tail.getNext();
    }

    public static class Node<A>
    {
        private A Element ;
        private Node<A>next ;

        public Node(A Element , Node<A> next)
        {
            this.Element=Element;
            this.next=next;
        }

        public A getElement() {
            return Element;
        }

        public void setElement(A element) {
            Element = element;
        }

        public Node<A> getNext() {
            return next;
        }

        public void setNext(Node<A> next) {
            this.next = next;
        }
    }
}
