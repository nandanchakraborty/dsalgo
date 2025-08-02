package SlidilingWindowAnd2pointersProblem;

import java.util.Scanner;

public class BinarySubArrayWithSumGoal {
    public static int SubArrayWithGoalSum(int[] ar, int goal){
        int l=0,r=0,maxlen=0;
        int len = ar.length;
        int cnt =0;
        for( r =0;r<len;r++){
            cnt+= ar[r];
            while(cnt > goal && l <= r){
                cnt -= ar[l];
                l++;
            }
            maxlen += r-l+1;
        }

        return maxlen;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []ar = new int[n];

        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        int goal = sc.nextInt();
        int ans = SubArrayWithGoalSum(ar,goal) - SubArrayWithGoalSum(ar,goal-1);
        System.out.println("length of the subArray with goal sum is : "+ans);

    }
}
/*Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

A subarray is a contiguous part of the array.



Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
*/