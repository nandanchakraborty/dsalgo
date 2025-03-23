public class implementStackUsingArray {
    int top =-1;
    int size =1000;
 public   int []arr = new int[size];

    int top(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
    void push(int v){
            top ++;
            arr[top] = v;
    }
    int pop (){
        if(top == -1)
            return 0;
        else {
            int x = arr[top];

            top--;
            return x;
        }
    }
    public static void main(String[]args){
        implementStackUsingArray s = new implementStackUsingArray();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());





    }}
