package Week8;

import java.util.Scanner;

/**
 * Created by Khaled Jalal on 3/15/2021.
 */
public class QArray<A> implements Queue<A> {

    A data[] ;
    static int capacity=100 ;
    int f = 0;
    int sz = 0;

    public QArray(int c) {
        data = (A[]) new Object[c];
    }

    public QArray() {
        this(capacity);
    }

    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int Size() {
        return sz;
    }

    @Override
    public A First() {
        if (isEmpty()) return null ;
        return data[f] ;
    }

    @Override
    public void enqueue(A element) {
     if (sz==data.length)
         throw new IllegalStateException("The Q is full .");
        int x  = (f+sz) % data.length;
        data[x] = element ;
        sz++;
    }

    @Override
    public A dequeue() {
        if (isEmpty())
            return null ;
        A del = data[f] ;
        data[f] = null ;
        f += 1 ;
        sz -= 1 ;
        return del ;
    }

    public void Rotate_left()
    {
        int i  ;
        A temp = data[0] ;
        for (i=0 ; i<Size()-1 ; i++)
        {
            data[i] = data[i+1] ;
        }
        data[Size()-1]= temp ;
    }
}
