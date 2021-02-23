package Week1;

import java.util.Scanner;

/**
 * Created by Khaled Jalal on 2/14/2021.
 */
public class InputEX {
    static int[] a = new int[6];
    static Scanner in = new Scanner(System.in);
    static int numOfElements=0;

    static public void InputElements(int x)
    {
            if(numOfElements<a.length){
                a[numOfElements]=x;
                numOfElements++;
            }
            else
                System.out.println("Sorry , The Array is full");

        }

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
        int x;
        System.out.println("Enter The Elements :");
        for (int i = 0; i <a.length ; i++) {
            x=in.nextInt();
            InputElements(x);
        }
        ////////////////////////////////////////////////
       Print();
    }

}
