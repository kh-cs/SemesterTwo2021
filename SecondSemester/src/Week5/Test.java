package Week5;

/**
 * Created by Khaled Jalal on 2/22/2021.
 */
public class Test {
    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<String>();
        SingleLinkedList<String> list2 = new SingleLinkedList<String>();
        list.Add_first("Khaled Jalal");
        list.Add_first("Alhasan");
        list.Add_Last("Omer");
        System.out.println(list.Print());
        System.out.println("______________________");
        int n=list.Size();
        for (int i = 0; i <n ; i++) {
            String x = list.Remove_From_Beginning();
            list2.Add_first(x);
            System.out.println(x);
        }
        System.out.println("______________________");
        System.out.println("The Size of Lists : ");
        System.out.println("Size of first list : "+list.Size());
        System.out.println("Size of second list : "+list2.Size());

    }
}
