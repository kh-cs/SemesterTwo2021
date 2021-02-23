package Week1;

import java.util.Scanner;

/**
 * Created by Khaled Jalal on 2/14/2021.
 */
public class DefinePrintArray {
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

    public static void main(String[] args) {
        Print();
    }

}
