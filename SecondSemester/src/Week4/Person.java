package Week4;

/**
 * Created by Khaled Jalal on 2/19/2021.
 */
public class Person {
    private String Name;
    private int Age;

    public Person(String name, int age) {
        Age = age;
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    public void setName(String name) {
        Name = name;
    }

}
