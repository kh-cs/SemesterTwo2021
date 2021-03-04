package Task5;

/**
 * Created by Khaled Jalal on 3/5/2021.
 */
public class TestConcatenatedLists {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.Add_Last(1);
        list.Add_Last(2);
        list.Add_Last(3);
        list.Add_Last(4);
        list.Add_Last(5);
        SingleLinkedList<Integer> list2 = new SingleLinkedList<>();
        list2.Add_Last(6);
        list2.Add_Last(7);
        list2.Add_Last(8);
        list2.Add_Last(9);
        list2.Add_Last(0);
        list.concatenation(list.getHead(),list2.getHead());
        System.out.println(list.Print());
    }
}
