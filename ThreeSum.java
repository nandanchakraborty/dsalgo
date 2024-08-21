/*Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such
that their sum is equal to the target. Otherwise, return NO.

2nd variant: Return indices of the two numbers such that
their sum is equal to the target. Otherwise, we will return {-1, -1}.
Note: You are not allowed to use the same element twice.
 Example: If the target is equal to 6 and num[1] = 3,
 then nums[1] + nums[1] = target is not a solution.

 And for the 3 sum  the question is 3 Sum : Find triplets that add up to a zero
*/
import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> triplet(int n,int[]arr){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            if(i!=0 && arr[i] == arr[i-1]) continue;//duplicate removing

            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < 0) j++;
                else if (sum > 0) k--;
                else {
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while(j<k && arr[j] == arr[j-1]) j++;
                    while(j<k && arr[k] == arr[k-1]) k--;

                }
            }


        }
        return ans;

    }

    public static void main(String[]args){
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }



    }



