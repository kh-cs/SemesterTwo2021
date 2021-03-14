package Task6.CircularlyLinkedList_HW;

import Task6.CircularlyLinkedList_HW.CircularlyLinkedList;

/**
 * Created by Khaled Jalal on 3/10/2021.
 */
public class TestSizeCounter {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list =new CircularlyLinkedList<>();
        list.Add_First(1);
        list.Add_First(2);
        list.Add_First(2);
        list.Add_First(2);
        list.Add_First(2);
        list.Add_First(2);
        list.Add_First(2);
        System.out.println(list.Size_Counter());
    }
}
