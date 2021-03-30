package Week8;

import Week7.SingleLinkedList;

/**
 * Created by Khaled Jalal on 3/15/2021.
 */
public class SingleLinkedQ<A> implements Queue<A> {
    SingleLinkedList<A> list = new SingleLinkedList<A>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int Size() {
        return list.Size();
    }

    @Override
    public A First() {
        return list.first();
    }

    @Override
    public void enqueue(A element) {
      list.Add_Last(element);
    }

    @Override
    public A dequeue() {
        return list.Remove_From_Beginning();
    }
}
