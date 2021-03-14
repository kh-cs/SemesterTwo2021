package Task6.CircularlyLinkedList_HW;

import Task6.CircularlyLinkedList_HW.CircularlyLinkedList;

/**
 * Created by Khaled Jalal on 3/5/2021.
 */
public class TestAddingQuestionOne {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> list =new CircularlyLinkedList<>();
        list.Add_First(1);
        list.Add_First(2);
        list.Add_without_local_variable(3);
        list.Add_without_local_variable(4);
        list.Add_without_local_variable(5);
        System.out.println(list.Print());
    }
}
