package Week8;

import java.util.Scanner;

public class RRQ {
    public static void main(String[] args) {
        QArray q = new QArray();
        Scanner in = new Scanner(System.in);
        int r_arr[] = new int[10] ;
        System.out.println("Enter the number of the processes :");
        int num = in.nextInt();
        System.out.println("Enter the burst time :");
        for (int i = 0; i <num ; i++) {
            System.out.print("\nP["+(i+1)+"] :");
            int x = in.nextInt();
            q.enqueue(x);
            r_arr[i]=x;
        }
        System.out.println("\n\nEnter the quantum time :");
        int quan = in.nextInt();
        int rp = num ;
        int i = 0 ;
        int time = 0 ;

        System.out.print("0");

        while (rp!=0)
        {
          if (r_arr[i]>quan)
          {
              r_arr[i]= r_arr[i]-quan ;
              System.out.print(" | P["+(i+1)+"] | ");
              time = time+quan ;
              System.out.print(time);
          }
          else if (r_arr[i]<=quan && r_arr[i]>0)
          {
              time = time + r_arr[i] ;
              r_arr[i]=r_arr[i]-r_arr[i];
              System.out.print(" | P["+(i+1)+"] | ");
              rp--;
              System.out.print(time);
          }
          i++;
          if (i==num)
          {
              i=0 ;
          }
        }
    }
}
