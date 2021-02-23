package Week4;

/**
 * Created by Khaled Jalal on 2/19/2021.
 */

public class OldPair {
    Object   first;
    Object   second;

    public OldPair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst()
    {

        return first;
    }

    public void setFirst(Object first)
    {
        this.first = first;
    }

    public Object getSecond()
    {
        return second;
    }

    public void setSecond(Object second)
    {
        this.second = second;
    }

    @Override
    public String toString() {
        return "OldPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }


    public static void main(String[] args) {
        OldPair bookpair =new OldPair("book1",12);
        String x =(String) bookpair.getFirst();
        int y=(int)bookpair.getSecond();
        System.out.println(x+ "   " +y);
        Student s1=new Student("khaled",30,122);
        Student s2=new Student("jalal",45,114);
        OldPair comp =new OldPair(s1,s2);
        System.out.println(s1+"    "+s2);;
    }
}
