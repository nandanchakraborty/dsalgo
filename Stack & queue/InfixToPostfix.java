import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    static int prec(char ch){
        switch (ch) {
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

    static String infixToPostfix(String exp){
        Stack<Character> stack = new Stack<>();
        String result = new String ("");
        for(int i=0;i<exp.length();++i){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c))
                result +=c;
            else if (c == '(')
                stack.push(c);
            else if (c== ')')
            {
                while(!stack.isEmpty() && stack.peek()!= '(')
                    result += stack.pop();
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && prec(c) <= prec(stack.peek())){
                    result+= stack.pop();
                }
                stack.push(c);
            }
        }
        return result;


    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter infix expression");
        String exp  = sc.nextLine();
        System.out.println("infix expression : "+ exp);
        System.out.println("postfix expression : "+infixToPostfix(exp));   }
}
