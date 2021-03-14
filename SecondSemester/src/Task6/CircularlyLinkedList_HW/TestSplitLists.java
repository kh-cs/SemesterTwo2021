package Task6.CircularlyLinkedList_HW;

import Task6.CircularlyLinkedList_HW.CircularlyLinkedList;

/**
 * Created by Khaled Jalal on 3/11/2021.
 */
public class TestSplitLists {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list =new CircularlyLinkedList<>();
        list.Add_First(1);
        list.Add_First(2);
        list.Add_First(3);
        list.Add_First(4);
        list.Add_First(5);
        list.Add_First(6);
        list.Split_even_list();
    }
}
