package RoundRobin;

import Week8.QArray;

import java.util.Scanner;

public class RoundRobinQ {
    public static void main(String[] args) {
        QArray<Integer> q = new QArray<>();
        QArray<Integer> q2 = new QArray<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Processes U need to Scheduling");
        int n = in.nextInt();
        System.out.println("Enter the Time for every process :");
        for (int i = 0; i <n ; i++) {
            System.out.print("\nP["+(i+1)+"] :");
            int x = in.nextInt();
            q.enqueue(x);
        }
        System.out.println("Enter the quantum time :");
        int y = in.nextInt();
        int rp = n ;
        int i = 0 ;
        int time = 0 ;
         while(rp!=0)
         {
             if (i>y)
             {
                 i=0 ;
             }
             if (q.First()>y)
             {
                 int d = q.First()-y;
                 System.out.print(" | P["+(i+1)+"] | ");
                 time = time + y ;
                 q.dequeue();
                 System.out.print(time);
                 q.enqueue(d);
             }

             else if (q.First()<=y && q.First()!=0)
             {
                 time = time +q.First() ;
                 q.dequeue();
                 System.out.print(" | P["+(i+1)+"] | ");
                 rp--;
                 System.out.print(time);
             }
             i++;

         }
    }
}
