package Task5;

/**
 * Created by Khaled Jalal on 2/22/2021.
 */
public class SingleLinkedList<A> {

    private Node<A> head = null ;
    private Node<A> tail = null ;
    private int size = 0;

    private boolean isEmpty()
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

    public Node<A> getHead()
    {
        return head ;
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

    /*
    HW \\   Question 1 :
     */
    public A Second_2_Last()
    {
        Node<A> newNode = head ;
        while (newNode.getNext()!=tail)
        {
            newNode=newNode.getNext();
        }
        return (A) newNode.getElement();
    }
    //////////////////////////////////////////////////////

    /*
    HW \\   Question 2 :
     */
    public int Size_2()
    {
        Node<A> temp = head ;
        int Size_2 = 0 ;
        if(head==null)
            return Size_2 ;
        else
        {
            Size_2++ ;
            while (temp.next!=null)
            {
                Size_2++;
                temp = temp.next ;
            }
        }
        return Size_2 ;
    }
    //////////////////////////////////////////////////////

    /*
    HW \\   Question 3 :
     */

    public void Rotate() {
        if (head != null) {
            Node current = head;
            while (current.getNext() != null) {
                tail = current;
                current = current.getNext();
            }
            if (tail != null) {
                tail.setNext(null);
                current.setNext(head);
                head = current;
            }
        }
    }

    //////////////////////////////////////////////////////

    /*
    HW \\   Question 4 :
     */

    public Node<A> concatenation(Node<A> head_1 , Node<A> head_2)
    {
        Node<A> temp = null ;
        if (head_1==null)
            return  head_2;
        if (head_2==null)
            return  head_1;
        temp=head_1.getNext();
        while (temp.getNext()!=null)
            temp = temp.next;
        temp.next=head_2.getNext() ;
        return head_1 ;
    }


    //////////////////////////////////////////////////////
    /*
    HW \\   Question 5 :
     */
    public Node<A> Reverse()
    {
        if (head==null)
        {
            return head;
        }
        Node<A> current = head ;
        Node<A> previous = null ;
        Node<A> next = current.next ;


        while (current!=null)
        {
            next = current.next ;
            current.next=previous ;
            previous = current ;
            current = next ;
        }

        head = previous ;
        return previous ;
    }

    //////////////////////////////////////////////////////
    public class Node<A> extends SingleLinkedList<A> {
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
