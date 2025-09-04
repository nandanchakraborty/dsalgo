package LinkedList;

class Node {
    int data;
    Node next;


    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
class LinkedList{
  static   Node convertArray2LL(int[] ar){
        Node head = new Node(ar[0]);
        Node mover = head;
        for(int i = 0; i< ar.length;i++){
            Node temp = new Node(ar[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;


    }
}
public class InsertionInLinkedList {

    public static void main(String[] args)
    {
        int []ar  = {2,3,4,5,6};
        Node head =   LinkedList.convertArray2LL(ar);

        Node temp =   head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
}
      