package Week7;

/**
 * Created by Khaled Jalal on 2/22/2021.
 */
public class SingleLinkedList<A> {

    private Node<A> head = null ;
    private Node<A> tail = null ;
    private int size = 0;

    public boolean isEmpty()
    {
        return size==0;
    }

    public int Size()
    {
        return size;
    }

    public A first()
    {
        if (isEmpty()) return null ;
        return head.getElement();
    }

    public A Last()
    {
        if (isEmpty()) return null ;
        return tail.getElement();
    }

    public void Add_first(A New_element)
    {
        head = new Node<A>(New_element,head);
        if(size==0)
            tail=head;
        size++;
    }

    public void Add_Last(A New_element)
    {
        Node<A> newest = new Node<A>(New_element,null);
        if(isEmpty())
            head=newest;
        else
            tail.setNext(newest);
        tail=newest;
        size++;
    }

    public Node<A> gethead()
    {
        return head ;
    }

    public A Remove_From_Beginning()
    {
        if(isEmpty())
            return null ;
        A deleted = head.getElement();
        head = head.getNext();
        size--;
        if(size==0)
            tail= null ;
        return deleted ;
    }

    public String Print()
    {
        Node<A> i = head ;
        String all ="";
        while (i!=null)
        {
            all = all+i.getElement().toString()+"\n";
            i=i.getNext();
        }
        return all ;
    }

    private static class Node<A>
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
