package Week8;

import Week6.CircularlyLinkedList;

/**
 * Created by Khaled Jalal on 3/15/2021.
 */
public class CircularalyLinkedQ<A> implements CQ<A> {

    private CircularlyLinkedList<A> list =  new CircularlyLinkedList<A>();

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
        return list.First_Element();
    }

    @Override
    public void enqueue(A element) {
      list.Add_Last(element);
    }

    @Override
    public A dequeue() {
        return list.Remove_From_Begining();
    }

    @Override
    public void rotate() {
      list.Rotate();
    }
}
