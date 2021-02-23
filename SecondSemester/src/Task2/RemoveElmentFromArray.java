package Task2;

import java.util.Scanner;

/**
 * Created by Khaled Jalal on 2/14/2021.
 */
public class RemoveElmentFromArray {
    static int [] a = {7,2,4,5,6,3,1};
    static Scanner in = new Scanner(System.in);

    static int [] temp = new int[a.length-1] ;

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

    static public void Remove(int x)
    {
        int y ;
        for (int i = 0 , k=0 ; i <a.length ; i++) {
            if(a[i]==x)
            {
                  continue;
            }

                temp[k++]=a[i];
        }
    }

    static public void PrintRemovedArray()
    {
        System.out.print("[ ");
        for (int i = 0; i <temp.length ; i++) {
            if(i==temp.length-1)
                System.out.print(temp[i]+" ]");
            else
                System.out.print(temp[i]+"  ,  ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Elements Before Remove : ");
        Print();
        System.out.println("\n============================================");
        System.out.println("Enter the Element you want to remove : ");
        int x = in.nextInt();
        Remove(x);
        System.out.println("==============================================");
        System.out.println("Elements After Remove : ");
        PrintRemovedArray();
    }
}
