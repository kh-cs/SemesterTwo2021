package Week6;

import java.util.LinkedList;

/**
 * Created by Khaled Jalal on 3/1/2021.
 */
public class JavaLinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> j_list = new LinkedList<>();

        j_list.addFirst("Khaled");
        j_list.addLast("Jalal");
        j_list.addLast("Al-arashi");

        int x = j_list.size() ;

        System.out.println("# The Elements of the List in Reveres Order :-");
        for (int i = 0; i <x ; i++) {
            System.out.println(j_list.removeLast());
        }

    }
}
