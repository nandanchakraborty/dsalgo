package SlidilingWindowAnd2pointersProblem;

import java.util.Scanner;

public class CountNumberOfNiceSubArray {

    private static int niceSubArray(int[] ar, int k) {
        int l=0,r=0,maxlen=0;
        int len = ar.length;
        int cnt =0;
        for( r =0;r<len;r++){
            cnt+= ar[r];
            while(cnt > k && l <= r){
                cnt -= ar[l];
                l++;
            }
            maxlen += r-l+1;
        }

        return maxlen;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []ar = new int[n];
        int []arr = new int [n];

        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            if(ar[i] % 2 !=0){
                arr[i] = 1;
            }
            else arr[i] = 0;
        }

        int ans = niceSubArray(arr,k) -niceSubArray(arr,k-1) ;
        System.out.println("sub array :"+ans);
    }


}
/*Given an array of integers nums and an integer k.
A continuous subarray is called nice if there are k odd numbers on it.


Return the number of nice sub-arrays.



Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3
 odd numbers are [1,1,2,1] and [1,2,1,1].
 */

