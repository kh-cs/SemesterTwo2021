package Week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Khaled Jalal on 2/22/2021.
 */
public class ReadFROMtxtFile {
    public static void main(String[] args) {

        SingleLinkedList<String> list = new SingleLinkedList<String>();

        try {
            Scanner in = new Scanner(new File("D://SecondSemester//src//Week5//Students.txt"));
            while (in.hasNext())
            {
                list.Add_Last(in.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list.Print());
    }
}
