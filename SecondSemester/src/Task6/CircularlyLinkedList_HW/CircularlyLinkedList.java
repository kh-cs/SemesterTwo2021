package Task6.CircularlyLinkedList_HW;

/**
 * Created by Khaled Jalal on 3/5/2021.
 */
public class CircularlyLinkedList<A> {
    private Node<A> tail ;
    private int size = 0 ;
    private Node<A> newest ;

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

    public Node<A> get_Tail()
    {
        return tail ;
    }


    public void Add_without_local_variable(A element)
    {
        if(isEmpty())
        {
            tail = new Node<A>(element,null) ;
            tail.setNext(tail);
        }
        else
        {
            newest = new Node<A>(element,tail.getNext());
            tail.setNext(newest);
        }
    }

    public int Size_Counter()
    {
        int count = 0 ;
        if(tail==null)
        {
            return count ;
        }
        else
        {
            count++;
            Node<A> temp = tail.getNext() ;
            while (temp!=tail)
            {
                count++;
                temp = temp.getNext() ;
            }
            return count ;
        }
    }

    public boolean if_equal(CircularlyLinkedList<A> list_2)
    {
        Node<A> a = this.tail.getNext() ;
        Node<A> b = list_2.get_Tail().getNext() ;
        while (a!=this.tail && b!=list_2.get_Tail())
        {
           if (b.getElement()!=a.getElement())
               return false;
           a = a.next ;
           b = b.next ;
        }
        return (a==this.tail && b==list_2.get_Tail());
    }

    public void Split_even_list()
    {
        int x =0 ;
        int z =this.Size()/2 ;
        if (this.isEmpty())
            return;
        if (this.Size()%2==0) {
            Node<A> a = tail.getNext() ;
            Node<A> temp =tail.getNext() ;

            System.out.print("First List is \n[ ");
            while (x < this.Size() / 2) {
                a = a.getNext();
                if (temp!=null)
                {
                    Node<A> new_Node = new Node<A>(tail.getNext().getElement(), tail.getNext());
                    temp.setNext(new_Node);
                }
                else
                {
                    temp = new Node<A>(tail.getNext().getElement(),null) ;
                    temp.setNext(temp);
                }
                if (x+1<this.Size() / 2)
                    System.out.print(temp.getElement()+"  ,  ");
                else
                    System.out.print(temp.getElement()+"");
                temp = a;
                x++;
                z++;
            }
            System.out.println(" ]");
            System.out.println("==================");
            System.out.print("Second List is \n[ ");
            Node<A> temp2 = a ;
            while (x<z)
            {
                a = a .getNext();
                if (temp2!=null)
                {
                    Node<A> new_Node = new Node<A>(a.getNext().getElement(), tail.getNext());
                    temp2.setNext(new_Node);
                }
                else
                {
                    temp2 = new Node<A>(a.getNext().getElement(),null) ;
                    temp2.setNext(temp2);
                }

                if (x+1<z)
                System.out.print(temp2.getElement()+"  ,  ");
                else
                    System.out.print(temp2.getElement()+"");
                temp2 = a;
                x++;
            }
            System.out.println(" ]");
        }
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

    public String Print()
    {
        Node<A> i = tail.getNext() ;
        String all ="";
        while (i!=tail)
        {
            all = all+i.getElement().toString()+"   ";
            i=i.getNext();
        }
        all = all+i.getElement().toString()+"   ";
        return all ;
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
