package Week7;

import java.util.Arrays;

/**
 * Created by Khaled Jalal on 3/8/2021.
 */
public class ArraysStack<A> implements Stack<A> {
    A data[];
    static int capacity = 100 ;
    int t = -1 ;

    public ArraysStack() {
        this(capacity);
    }

    public ArraysStack(int c) {
        data =(A[]) new Object[c];
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int Size() {
        return t+1;
    }

    @Override
    public A top() {
        if (isEmpty()) return null ;
        return data[t];
    }

    @Override
    public void push(A element) {
        if(Size()==data.length) throw new IllegalStateException("Sorry , The Stack is full .");
        // OR t+1 instead Size() Method
        data[++t] = element ;
    }

    @Override
    public A pop() {
        if (isEmpty())
        return null;
        A d = data[t] = null ;
        t--;
        return d ;
    }

    public void display()
    {
        int x = t ;
        for (int i = 0; i <t+1/2 ; i++) {
            A temp = data[i] ;
            data[i] = data[x] ;
            data[x] = temp ;
            x--;
        }
        System.out.println(Arrays.toString(data));
    }
}