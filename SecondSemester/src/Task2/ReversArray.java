package Task2;

/**
 * Created by Khaled Jalal on 2/15/2021.
 */
public class ReversArray {
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

    static public void Revers()
    {
        int x=a.length-1;
        for (int i = 0; i <a.length/2 ; i++) {
            int temp = a[i];
            a[i]=a[x];
            a[x]=temp;
            x--;
        }
    }

    public static void main(String[] args) {
        System.out.println("Before Revers :");
        Print();
        Revers();
        System.out.println("\nAfter Revers :");
        Print();
    }
}
