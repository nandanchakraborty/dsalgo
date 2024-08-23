//Problem Statement: Given an array containing both positive and negative integers,
// we have to find the length of the longest
// SubArray with the sum of all elements equal to zero.
import java .util.*;
public class LongestSubArraySumEqualToZero {
 public static    int maxLen(int a[],int n){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int maxi = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+a[i];
            if(sum == 0 ){
                maxi = i+1;
            }
            else {
                if(mpp.get(sum) != null ){
                    maxi = Math.max(maxi ,i-mpp.get(sum));
                }
                else {
                    mpp.put(sum,i);
                }
            }
        }
        return maxi;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();

        }
        System.out.println("Longest subarray with sum 0 is "+ maxLen(ar,n));

    }
}
