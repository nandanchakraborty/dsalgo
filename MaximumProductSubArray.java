import java.util.Scanner;

/*Problem Statement: Given an array that contains both negative and positive integers,
 find the maximum product subarray.
 */
public class MaximumProductSubArray {
    public static int maxSubarrayProduct(int[]a,int n){
        int pre = 1;
        int suf =1;
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pre == 0) pre =1;
            if(suf == 0) suf =1;
            pre = pre*a[i];
            suf = suf*a[n-i-1];
            maxProduct = Math.max(maxProduct,Math.max(pre,suf));

        }
       return maxProduct;
    }

    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc .nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int ans = maxSubarrayProduct(a,n);
        System.out.println("max sub array proudct is : "+ans);
    }
}
