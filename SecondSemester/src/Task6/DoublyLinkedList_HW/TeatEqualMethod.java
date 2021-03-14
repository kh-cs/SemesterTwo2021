package Task6.DoublyLinkedList_HW;

/**
 * Created by Khaled Jalal on 3/11/2021.
 */
public class TeatEqualMethod {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> D_list = new DoubleLinkedList<>();
        D_list.Add_Last(1);
        D_list.Add_Last(2);
        D_list.Add_Last(3);
        D_list.Add_Last(4);
        DoubleLinkedList<Integer> D_list2 = new DoubleLinkedList<>();
        D_list2.Add_Last(1);
        D_list2.Add_Last(2);
        D_list2.Add_Last(3);
        D_list2.Add_Last(4);
        if (D_list.if_equal(D_list2)==true)
            System.out.println("The Doubly Linked Lists Are Equal . ");
        else
            System.out.println("The Doubly Linked Lists Aren't Equal . ");
    }
}
