package Week6;

/**
 * Created by Khaled Jalal on 3/1/2021.
 */
public class TestCircularly {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> C_List = new CircularlyLinkedList<>();
        C_List.Add_First(1);
        C_List.Add_Last(2);
        C_List.Add_Last(3);
        C_List.Rotate();
        int x = C_List.Size();
        for (int i = 0; i <x ; i++) {
            System.out.println(C_List.First_Element());
            C_List.Rotate();
        }
        System.out.println("============================");
        System.out.println("The Size is = "+C_List.Size());

    }
}
