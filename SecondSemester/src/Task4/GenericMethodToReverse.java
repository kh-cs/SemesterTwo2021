package Task4;

/**
 * Created by Khaled Jalal on 2/19/2021.
 */
public class GenericMethodToReverse {
    ///////////////////////////////////////////////////////////////
    static Integer [] intArr ={1,2,3,4,5,6};
    static Double [] doubleArr ={1.3,1.4,0.5,3.2};
    static Character [] charArr ={'a','b','c','d','e'};
    static String [] strArr ={"khaled","mohammed","ibrahim"};
    static Float [] floatArr ={1.5f,4.8f,20.3f,2.4f};
    ///////////////////////////////////////////////////////////////
    public static <A> void GenericReverse(A[] array )
    {
        int x = array.length-1 ;
        for (int i = 0; i <array.length/2 ; i++) {
            A temp = array[i];
            array[i]=array[x];
            array[x]=temp;
            x--;
        }
    }
    ///////////////////////////////////////////////////////////////
    public static <a> void Print(a[] array)
    {
        System.out.print("[ ");
        for (int i = 0; i <array.length ; i++) {
            if(i<array.length-1)
                System.out.print(array[i]+"  ,  ");
            else
                System.out.println(array[i]+"  ]");
        }
    }
    ///////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println("Integer Array ( Before_Reverse ) :");
        System.out.println("----------------------------------\n");
        Print(intArr);
        System.out.println("\nInteger Array ( After_Reverse ) :");
        System.out.println("----------------------------------\n");
        GenericReverse(intArr);
        Print(intArr);
        System.out.println("\n___________________________________________");
        System.out.println("____________________________________________");
        System.out.println("Float Array ( Before_Reverse ) :");
        System.out.println("----------------------------------\n");
        Print(floatArr);
        System.out.println("\nFloat Array ( After_Reverse ) :");
        System.out.println("----------------------------------\n");
        GenericReverse(floatArr);
        Print(floatArr);
        System.out.println("\n___________________________________________");
        System.out.println("____________________________________________");
        System.out.println("Double Array ( Before_Reverse ) :");
        System.out.println("----------------------------------\n");
        Print(doubleArr);
        System.out.println("\nDouble Array ( After_Reverse ) :");
        System.out.println("----------------------------------\n");
        GenericReverse(doubleArr);
        Print(doubleArr);
        System.out.println("\n___________________________________________");
        System.out.println("____________________________________________");
        System.out.println("String Array ( Before_Reverse ) :");
        System.out.println("----------------------------------\n");
        Print(strArr);
        System.out.println("\nString Array ( After_Reverse ) :");
        System.out.println("----------------------------------\n");
        GenericReverse(strArr);
        Print(strArr);
        System.out.println("\n___________________________________________");
        System.out.println("____________________________________________");
        System.out.println("Character Array ( Before_Reverse ) :");
        System.out.println("----------------------------------\n");
        Print(charArr);
        System.out.println("\nCharacter Array ( After_Reverse ) :");
        System.out.println("----------------------------------\n");
        GenericReverse(charArr);
        Print(charArr);
        System.out.println("\n___________________________________________");
        System.out.println("____________________________________________");

    }
}
