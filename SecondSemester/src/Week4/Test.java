package Week4;

/**
 * Created by Khaled Jalal on 2/19/2021.
 */
public class Test {
    public static void main(String[] args) {
        Person p1;
        Student s1 = new Student("khaled", 1, 1);
        p1 = s1;  //Widening Casting.
        System.out.println(p1);


        Person p2 = new Student("jalal", 30, 555); // polymorphism
        Student s2;
        if (p2 instanceof Student) {
            s2 = (Student) p2;
            System.out.println(s2);
        }

    }
}