package Week8;

/**
 * Created by Khaled Jalal on 3/15/2021.
 */
public class Test {
    public static void main(String[] args) {
        QArray<String> q = new QArray<>(3);
        q.enqueue("Khaled");
        q.enqueue("Jalal");
        q.enqueue("Al-arashi");
        while (!q.isEmpty())
        {
            System.out.println(q.dequeue());
        }

    }
}
