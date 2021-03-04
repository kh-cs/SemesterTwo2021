package Week6;

/**
 * Created by Khaled Jalal on 3/1/2021.
 */
public class TestDoubly {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> D_list = new DoubleLinkedList<>();
        D_list.Add_Last(1);
        D_list.Add_Last(2);
        D_list.Add_Last(3);
        int n = D_list.Size();
        for (int i = 0; i <n ; i++) {
            System.out.println(D_list.Remove_Last());
        }
    }
}
