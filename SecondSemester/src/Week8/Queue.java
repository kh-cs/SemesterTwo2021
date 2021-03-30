package Week8;

/**
 * Created by Khaled Jalal on 3/15/2021.
 */
public interface Queue<A> {
    boolean isEmpty();
    int Size();
    A First();
    void enqueue(A element);
    A dequeue();
}
