package Task8;

import Week8.CircularalyLinkedQ;

public class TestJosephus {
    public static void main(String[] args) {

        CircularalyLinkedQ<String> queue = new CircularalyLinkedQ<>();
        JosephusProblem<String> j = new JosephusProblem<>();
        queue.enqueue("Khaled");
        queue.enqueue("Ibrahim");
        queue.enqueue("Hasan");
        System.out.println("The Winner is : "+j.Josephus(queue,4));
    }
}
