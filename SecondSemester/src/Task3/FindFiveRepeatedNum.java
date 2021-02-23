package Task3;

/**
 * Created by Khaled Jalal on 2/15/2021.
 */
public class FindFiveRepeatedNum {
    static int [] a = {7,2,4,5,6,3,1,7,3,7,2,1,7,3,8,7,5,7};

    static public void Find_Repeated()
    {
        for (int i = 0; i <a.length ; i++) {
            int x = 0 ;
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]==a[j])
                {
                    x++;
                }
            }
            if(x==5)
            {
                System.out.println(a[i]+" is Repeated five Times . ");
            }
        }
    }

    public static void main(String[] args) {
        Find_Repeated();
    }
}
