import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {

    static int prec(char ch) {
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

    static String infixToPrefix(String exp) {
        Stack<Character> s = new Stack<>();
        String result = "";
        StringBuilder sb = new StringBuilder(exp);
        sb.reverse();
        exp = sb.toString();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result = result + c;
            } else if (c == ')') {
                s.push(c);
            } else if (c == '(') {
                while (!s.isEmpty() && s.peek() != ')') {
                    result += s.pop();
                }
                s.pop();
            } else {
                while (!s.isEmpty() && prec(c) < prec(s.peek())) {
                    result = result + s.pop();
                }
                s.push(c);
            }
        }

        while (!s.isEmpty()) {
            result += s.pop();
        }

        StringBuilder ab = new StringBuilder(result);
        ab.reverse();
        result = String.valueOf(ab);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix expression:");
        String exp = sc.nextLine();
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix expression: " + infixToPrefix(exp));
    }
}
