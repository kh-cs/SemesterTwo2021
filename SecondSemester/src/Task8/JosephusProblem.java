package Task8;

import Week8.CircularalyLinkedQ;

/**
 * Created by Khaled Jalal on 3/16/2021.
 */

public class JosephusProblem<A> {

    public <A> A Josephus(CircularalyLinkedQ<A> q, int k )
    {
       if (q.isEmpty())
       {
           return null ;
       }
       while(q.Size()>1)
       {

        for (int i = 0; i <k ; i++)
            q.enqueue(q.dequeue());
        A e = q.dequeue();
        System.out.println("    " +e+"  is out .");
       }
       return q.dequeue();
    }

}
