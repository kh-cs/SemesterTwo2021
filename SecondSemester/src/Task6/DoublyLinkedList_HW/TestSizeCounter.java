package Task6.DoublyLinkedList_HW;

/**
 * Created by Khaled Jalal on 3/11/2021.
 */
public class TestSizeCounter {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> D_list = new DoubleLinkedList<>();
        D_list.Add_Last(1);
        D_list.Add_Last(2);
        D_list.Add_Last(3);
        D_list.Add_Last(4);
        D_list.Add_Last(5);
        D_list.Add_Last(6);
        D_list.Add_Last(7);
        D_list.Add_Last(9);
        D_list.Add_Last(10);
        System.out.println("The Size of Doubly Linked List is :"+D_list.Size_Counter());
    }
}
