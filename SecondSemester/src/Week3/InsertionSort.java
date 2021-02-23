package Week3;

/**
 * Created by Khaled Jalal on 2/14/2021.
 */
public class InsertionSort {
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

    static public void InsertionSort()
    {
        for (int i = 0; i <a.length ; i++) {
            int temp = a[i];
            int j =i-1 ;
            for (  ; j >=0 && a[j]>temp ; j--) {
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
    }



    public static void main(String[] args) {
        Print();
        System.out.println();
        InsertionSort();
        Print();
    }
}
