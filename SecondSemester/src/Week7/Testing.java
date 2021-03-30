package Week7;

/**
 * Created by Khaled Jalal on 3/8/2021.
 */
public class Testing {
    public static void main(String[] args) {
        ArraysStack<Integer> s = new ArraysStack<>(10);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.display();
    }
}
