package Task4;

import java.lang.reflect.Array;
/**
 * Created by Khaled Jalal on 2/21/2021.
 */
public class GenericToMergeArrays2 {
    static Integer [] intArr_1 ={1,2,3,4,5,6};
    static Integer [] intArr_2 ={7,8,9,10,11};

    public static<T> T[] concatenate(T[] first, T[] second)
    {
        T[] ob = (T[]) Array.newInstance(first.getClass().getComponentType(),
                first.length + second.length);

        System.arraycopy(first, 0, ob, 0, first.length);
        System.arraycopy(second, 0, ob, first.length, second.length);

        return ob;
    }

    public static <a> void Print(a[] array)
    {
        System.out.print("[ ");
        for (int i = 0; i <array.length ; i++) {
            if(i<array.length-1)
                System.out.print(array[i]+"  ,  ");
            else
                System.out.println(array[i]+"  ]");
        }
    }

    public static void main(String[] args) {
        Print(concatenate(intArr_1,intArr_2));
    }

}
