package Week3;

import java.util.Scanner;

/**
 * Created by Khaled Jalal on 2/14/2021.
 */
public class SequentialSearch {
    static int [] a = {7,2,4,5,6,3,1};

    static public void Print()
    {
        System.out.print("[ ");
        for (int i = 0; i <a.length ; i++) {
            if(i==a.length-1)
                System.out.print(a[i]+" ]");
            else
                System.out.print(a[i]+"  ,  ");
        }
    }

    static public boolean Sequential_Sort(int element)
    {
        int x = -1 ;
        int i =  0 ;
        boolean f = false ;
        while(!f && i<a.length)
        {
            if(a[i] == element)
            {
                f = true ;
                x = i ;
            }
            i++;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Enter The Element : ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("The Result of Search  : "+ Sequential_Sort(x));
    }
}
