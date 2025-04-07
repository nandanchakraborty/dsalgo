import java.util.Stack;

public class AsteroidCollision {
    public static int[] AstCollision(int[] ar) {
        Stack<Integer> stack = new Stack<>();

        for (int aray : ar) {
            if (aray > 0) {
                stack.push(aray);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -aray) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() > 0) {
                    if (stack.peek() == -aray) {
                        stack.pop();
                    }
                } else {
                    stack.push(aray);
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ar = {4, 7, 1, 1, 2, -3, -7, 17, 15, -16};
        int[] ans = AstCollision(ar);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}