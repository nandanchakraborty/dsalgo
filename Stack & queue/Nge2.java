public class Nge2 {

    //another way of finding next greater element ...
    public static int []nextGreaterElement(int []arr){
        int n = arr.length;
        int []nge = new int[n];
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<i+n-1;j++){
            int ind = j%n;

            if(arr[ind]>arr[i]){
                nge[i] = arr[ind];
                break;
            }
            else {
                nge[i] = -1;
            }
            }
        }

        return nge;
    }

    public static void main(String []args){
        int []ar = {2,10,12,1,11};
        int []arr = nextGreaterElement(ar);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
