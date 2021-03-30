package Week7;

/**
 * Created by Khaled Jalal on 3/8/2021.
 */
public interface Stack<A>
{
    boolean isEmpty();
    int Size();
    A top();
    void push(A element);
    A pop();
}
