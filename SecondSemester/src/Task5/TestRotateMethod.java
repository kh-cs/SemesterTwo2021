package Task5;

/**
 * Created by Khaled Jalal on 3/1/2021.
 */
public class TestRotateMethod {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list =new SingleLinkedList<>();
        list.Add_Last(1);
        list.Add_Last(2);
        list.Add_Last(3);
        list.Add_Last(4);
        list.Add_Last(5);
        System.out.println(list.Print());
        list.Rotate();
        System.out.println("After Rotation : \n");
        System.out.println(list.Print());
    }
}
