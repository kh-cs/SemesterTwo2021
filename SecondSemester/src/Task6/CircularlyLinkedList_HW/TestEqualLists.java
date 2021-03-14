package Task6.CircularlyLinkedList_HW;

import Task6.CircularlyLinkedList_HW.CircularlyLinkedList;

/**
 * Created by Khaled Jalal on 3/11/2021.
 */
public class TestEqualLists {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list =new CircularlyLinkedList<>();
        list.Add_First(1);
        list.Add_First(2);
        list.Add_First(3);
        list.Add_First(4);
        CircularlyLinkedList<Integer> list2 =new CircularlyLinkedList<>();
        list2.Add_First(1);
        list2.Add_First(2);
        list2.Add_First(3);
        list2.Add_First(4);

        if (list.if_equal(list2)==true)
            System.out.println("The lists are equal .");
        else
            System.out.println("They are not equal .");
    }
}
