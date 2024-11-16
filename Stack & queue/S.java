
public class S {
    private class stackNode{
        int data;
        stackNode next;

        stackNode(int d){
            data = d;
            next = null;
        }
    }

    stackNode top;
    int size;

    S(){
        this.top = null;
        this.size = 0;
    }

    public void stackPush(int x){
        //noinspection WriteOnlyObject
        stackNode element = new stackNode(x);
        element.next = top;
        top = element;
        System.out.println("element pushed");
        size++;

    }
    public int stackPop(){
        if(top == null) return -1;
        int topData = top.data;
        stackNode temp = top;
        top = top.next;
        return topData;
    }

    public int stackSize(){
        return size;
    }

    public boolean stackIsEmpty(){
        return top == null;
    }

    public void printStack(){
        stackNode current = top;
        while(current !=null){
            System.out.print(current.data+" ");
            current = current.next;

        }
        System.out.println();
    }


        public static void main(String[]args) {
            S s = new S();
            s.stackPush(10);
            s.stackPush(20);
            s.printStack();
            System.out.println("Element popped " + s.stackPop());
            System.out.println("Stack size: " + s.stackSize());
            System.out.println("Stack is empty or not: " + s.stackIsEmpty());

        }

    }

