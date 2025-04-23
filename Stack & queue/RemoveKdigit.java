import java.util.Scanner;
import java.util.Stack;

public class RemoveKdigit {
    public static String removekdigit(String s, int k) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            // While we can remove digits (k > 0), stack is not empty,
            // and current digit is smaller than the top of stack
            while(!st.empty() && k > 0 && current < st.peek()) {
                st.pop();
                k--;
            }
            st.push(current);
        }

        // Remove remaining digits if k > 0
        while(k > 0 && !st.empty()) {
            st.pop();
            k--;
        }

        if(st.empty()) return "0";

        // Build the result string
        StringBuilder res = new StringBuilder();
        while(!st.empty()) {
            res.append(st.pop());
        }
        res.reverse();

        // Remove leading zeros
        int start = 0;
        while(start < res.length() && res.charAt(start) == '0') {
            start++;
        }

        if(start == res.length()) return "0";
        return res.substring(start);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // string type number
        int k = sc.nextInt();
        String ans = removekdigit(s, k);
        System.out.println(ans);
    }
}