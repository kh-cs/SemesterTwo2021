package Task3;

/**
 * Created by Khaled Jalal on 2/15/2021.
 */
public class FindRpeatedNum {
    static int [] a = {7,2,4,5,6,3,1,4,5};

    static public void Find_Repeated_Element()
    {
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]==a[j])
                {
                    System.out.println("The "+a[i]+" is Repeated .");
                }
            }
        }
    }

    public static void main(String[] args) {
        Find_Repeated_Element();
    }
}
