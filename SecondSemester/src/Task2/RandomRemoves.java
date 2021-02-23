package Task2;

import java.util.Random;

/**
 * Created by Khaled Jalal on 2/15/2021.
 */
public class RandomRemoves {
    static int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

    static void RemoveElements(int[] array) {
        Random r = new Random();
        while (array.length > 0) {
            int index = r.nextInt(array.length);
            System.out.println("Index = " + index + ", Element = " + array[index]);
            int[] array1 = new int[array.length - 1];
            for (int i = 0; i < index; i++)
                array1[i] = array[i];
            for (int i = index; i < array.length - 1; i++)
                array1[i] = array[i + 1];
            array = array1;
            for (int i = 0; i <array.length ; i++) {
                System.out.println(array[i]);
            }
            System.out.println("===============================");
        }
    }

    public static void main(String[] args) {

        RemoveElements(a);
    }

}
