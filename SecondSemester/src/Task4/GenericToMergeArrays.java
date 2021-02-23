package Task4;

import java.util.Arrays;

/**
 * Created by Khaled Jalal on 2/19/2021.
 */

/*
Q1/ How to make Signature of Print() method is the return of merge method ?
 */

public class GenericToMergeArrays {

    static Integer [] intArr ={1,2,3,4,5,6};
    static Integer [] intArr2 ={7,8,9,10,11,12};

    public static <A> A[] Merge(A[] array_1 , A[] array_2)
    {
        int temp=0;
        A[] New_Array = (A[]) new Object[array_1.length+array_2.length];
        for (int i = 0; i <New_Array.length ; i++) {
            if (i<array_1.length)
                New_Array[i]=array_1[i];
            else {
                New_Array[i] = array_2[temp];
                temp++;
            }
        }
        //System.out.println(Arrays.toString(New_Array));
        return New_Array;
    }
    /////////////////////////////////////////////////////////
    public static <A> void Print(A[] array)
    {
        System.out.print("[ ");
        for (int i = 0; i <array.length ; i++) {
            if(i<array.length-1)
                System.out.print(array[i]+"  ,  ");
            else
                System.out.println(array[i]+"  ]");
        }
    }
    /////////////////////////////////////////////////////////
    public static void main(String[] args) {

        Print( Merge(intArr,intArr2));
    }
}
