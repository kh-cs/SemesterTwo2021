package Week4;

/**
 * Created by Khaled Jalal on 2/19/2021.
 */

public class Pair<A,B> {
   A first;
   B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Pair<String,Integer> bookPair =new Pair<>("book1",22); // the Name of Class not Int Integer.
        String x=bookPair.getFirst();
        int y=bookPair.getSecond();
        System.out.println(x+"  "+y);
        Student s1=new Student("khaled",30,122);
        Student s2=new Student("jalal",45,114);
        Pair <Student,Student> comp =new Pair<> (s1,s2);
        System.out.println(comp);
    }
}
