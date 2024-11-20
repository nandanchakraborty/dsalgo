import java.util.Scanner;
import java.util.Stack;

public class Balance_parenthesis {
    public static int balanceBracket(String s){
        Stack<Character> St = new Stack<Character>();
        for(char it : s.toCharArray()){
            if((it == '(') || (it == '{') || (it == '[')){
                St.push(it);
            }
            else {
                if(St.isEmpty()) return 0;
                char ch = St.pop();
                if((it == ')' && ch == '(') || (it == '}' && ch == '{')  || (it == ']' && ch == '[')) continue;
            else return 0;
            }

        }
        return 1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
      int t =  balanceBracket(s);
      if(t == 1) System.out.println("Balanced Bracket");
      else System.out.println("Not balanced");
    }
}