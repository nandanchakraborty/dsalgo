import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterelement(int []arr){
    int n = arr.length;
     int []nge = new int[n];
     Stack<Integer> st = new Stack<>();
     for(int i=2*n-1 ;i>=0;i--){
         while(!st.empty() && st.peek()  <=arr[i%n]){
             st.pop();
         }
         if(i<n){
             if(!st.empty()){
                 nge[i]=st.peek();
             }
             else {
                 nge[i] = -1;
             }
             st.push(arr[i%n]);
         }
     }

      return nge;
    }

    public static void main(String[]args){
        int []arr = {3,10,4,2,1,2,6,1,7,2,9};
        int []ar  = nextGreaterelement(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

    }
}
