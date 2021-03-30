package Week7;

/**
 * Created by Khaled Jalal on 3/8/2021.
 */
public class LinkedListStack<A> implements Stack<A> {

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
    public A top() {
        return list.first();
    }

    @Override
    public void push(A element) {
      list.Add_first(element);
    }

    @Override
    public A pop() {
        return list.Remove_From_Beginning();
    }
}
