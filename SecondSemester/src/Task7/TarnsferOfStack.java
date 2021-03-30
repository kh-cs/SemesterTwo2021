package Task7;

import Week7.ArraysStack;

public class TarnsferOfStack<A> {

    public void Transfer(ArraysStack<A> S , ArraysStack<A> T)
    {
        int x =S.Size();

        for (int i = 1; i <=x ; i++) {
            System.out.println("S = "+S.top());
            T.push(S.top());
            S.pop();
        }
        System.out.println("=================================");
        int y =T.Size();
        for (int i = 1; i <=y ; i++) {
            System.out.println("T = "+T.top());
            T.pop();
        }
    }

    public static void main(String[] args) {
        ArraysStack<Integer> S = new ArraysStack<>();
        ArraysStack<Integer> T = new ArraysStack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        TarnsferOfStack t = new TarnsferOfStack();
        t.Transfer(S,T);
    }
}
