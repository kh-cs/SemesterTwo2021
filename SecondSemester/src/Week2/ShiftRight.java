package Week2;

/**
 * Created by Khaled Jalal on 2/14/2021.
 */
public class ShiftRight {
    static int [] a = {7,2,4,5,6,3,1};

    static public void Print()
    {
        System.out.print("[ ");
        for (int i = 0; i <a.length ; i++) {
            if(i<a.length-1)
                System.out.print(a[i]+"  ,  ");
            else
                System.out.println(a[i]+"  ]");
        }
    }

    static public void ShiftRight()
    {
        int i ;
        for ( i= a.length-1; i >0 ; i--) {
            a[i]=a[i-1];
        }
            a[0]=0;
    }

    public static void main(String[] args) {
        System.out.println("Before Shift_Right : ");
        Print();
        System.out.println("=====================");
        System.out.println("After Shift_Right  : ");
        ShiftRight();
        Print();
    }

}
