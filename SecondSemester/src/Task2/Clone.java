package Task2;

/**
 * Created by Khaled Jalal on 2/15/2021.
 */
public class Clone {
    static int [] a = {7,2,4,5,6,3,1};
    static int [] b = new int[a.length];

    static public void Clone()
    {
        for (int i = 0; i <a.length ; i++) {
            b[i]=a[i];
        }
    }

    static public void Print_Cloned_Array()
    {
        System.out.print("[ ");
        for (int i = 0; i <b.length ; i++) {
            if(i==b.length-1)
                System.out.print(b[i]+" ]");
            else
                System.out.print(b[i]+"  ,  ");
        }
    }

    public static void main(String[] args) {
        System.out.println("The Array Before Clone : ");
        Print_Cloned_Array();
        System.out.println("\n\n");
        System.out.println("The Array After Clone  : ");
        Clone();
        Print_Cloned_Array();
    }
}
