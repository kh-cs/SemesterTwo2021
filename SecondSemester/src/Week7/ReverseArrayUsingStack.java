package Week7;

import java.util.Arrays;

/**
 * Created by Khaled Jalal on 3/8/2021.
 */
public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        LinkedListStack<Character> c  = new LinkedListStack<>();
        char a[] ={'a','b','c','d','e'} ;
        for (int i = 0; i <a.length ; i++) {
            c.push(a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
            a[i] = c.pop();
        }
        System.out.println(Arrays.toString(a));
    }
}
