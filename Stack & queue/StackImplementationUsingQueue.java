import java.util.*;

public class StackImplementationUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.add(x);
        int n = q.size();
        for (int i = 0; i < n - 1; i++) {
            q.add(q.remove());
        }
    }

    int pop() {
        return q.remove();
    }

    int top() {
        return q.peek();
    }

    int size() {
        return q.size();
    }

    public static void main(String[] args) {
        StackImplementationUsingQueue s = new StackImplementationUsingQueue();

        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);

        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());
    }
}
