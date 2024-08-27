/*Problem Statement: You are given a read-only array of N
integers with values also in the range [1, N] both inclusive.
Each integer appears exactly once except A which appears twice
and B which is missing. The task is to find the repeating and
missing numbers A and B where A repeats twice and B is missing.
 */

import java.util.*;

public class FindMissingAndRepeatingNumber {
    public static int[] findMissingRepeatingNumbers(int []a){
    int len = a.length;
    int xr = 0;
    for(int i=0;i<len;i++){
        xr = xr ^ a[i];
        xr = xr ^(i+1);


    }
    System.out.println("xr -"+xr);
        // Find the rightmost set bit in xr
        int bitNo = (xr & ~(xr - 1));


        int zero =0;
    int one = 0;
    for(int i=0;i<len;i++){
        if((a[i] & bitNo) !=0){
            one = one ^ a[i];


        }
        else {
            zero = zero ^ a[i];
        }
    }
    for(int i=1;i<=len ;i++){
        if((i &(1 << bitNo ))!=0){
            one = one ^ i;

        }
        else zero = zero^i;
    }
    int cnt =0;
    for(int i=0;i<len;i++){
        if(a[i] == zero) cnt++;
    }
    if(cnt == 2 ) return new int [] {zero,one};
    else return new int [] {one ,zero};


    }
    public static void main(String []args){
        int[] a = {1,2,3,4,5,5,6};
        int[] ans = findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                + ans[0] + ", " + ans[1] + "}");


    }
}
