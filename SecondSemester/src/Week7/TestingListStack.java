package Week7;

/**
 * Created by Khaled Jalal on 3/8/2021.
 */
public class TestingListStack {
    public static void main(String[] args) {
        LinkedListStack<Integer> l = new LinkedListStack<>();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        l.push(5);
        while(!l.isEmpty())
            System.out.println(l.pop());
    }
}
