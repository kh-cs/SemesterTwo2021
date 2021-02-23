package Week4;

/**
 * Created by Khaled Jalal on 2/19/2021.
 */

public class GenericMethod {
    public static<T> void print(T arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] a={11,12,13,14,15};
        String[] b={"aaa","bbbb","ccc"};
        print(a);
        print(b);
    }
}
