package Week8;

import Week6.DoubleLinkedList;

/**
 * Created by Khaled Jalal on 3/15/2021.
 */
public class DoublyLinkedQ<A> implements Queue<A> {

    private DoubleLinkedList<A> l = new DoubleLinkedList<A>();

    @Override
    public boolean isEmpty() {
        return l.isEmpty();
    }

    @Override
    public int Size() {
        return l.getSize();
    }

    @Override
    public A First() {
        return l.Last();
    }

    @Override
    public void enqueue(A element) {
      l.Add_Last(element);
    }

    @Override
    public A dequeue() {
        return l.Remove_First();
    }
}
