import java.util.Stack;

public class ImplementQusingStack {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    ImplementQusingStack(){}

    public void push(int x){
        input.push(x);
    }

    public int  pop(){
        moveInputToOutput();
        return output.pop();
    }

    public int peek(){
        moveInputToOutput();
        return output.peek();
    }

    public int size(){
        return input.size()+output.size();
    }


    public void  moveInputToOutput(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
    }

    public static void main(String []args){

        ImplementQusingStack q = new ImplementQusingStack();
        q.push(3);
        q.push(4);
        System.out.println("The element popped is " + q.pop()); // Should print 3

        q.push(5);
        System.out.println("The front element is " + q.peek()); // Should print 4
        System.out.println("The size of the queue is " + q.size()); // Should print 2



    }

}
