package Task7;

import Week7.ArraysStack;

public class InfixToPostfix {

    static int Prec(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    // The main method that converts
    // given infix expression
    // to postfix expression.
    static String infixToPostfix(String exp)
    {
        // initializing empty String for result
        String result = new String("");

        // initializing empty stack
        ArraysStack<Character> s = new ArraysStack<>();

        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

                // If the scanned character is an '(',
                // push it to the stack.
            else if (c == '(')
                s.push(c);

                //  If the scanned character is an ')',
                // pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')')
            {
                while (!s.isEmpty() &&
                        s.top() != '(')
                    result += s.pop();

                s.pop();
            }
            else // an operator is encountered
            {
                while (!s.isEmpty() && Prec(c)
                        <= Prec(s.top())){

                    result += s.pop();
                }
                s.push(c);
            }

        }

        // pop all the operators from the stack
        while (!s.isEmpty()){
            if(s.top() == '(')
                return "Invalid Expression";
            result += s.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String exp = "a+b";
        System.out.println("Infix : "+exp);
        System.out.println("Postfix : "+infixToPostfix(exp));
    }
}
