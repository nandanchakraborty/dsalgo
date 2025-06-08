package SlidilingWindowAnd2pointersProblem;


import java.util.Scanner;

public class LongestConsecutiveOnes{
    /*Input : num = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0] , k = 3
Output : 10
Explanation : The maximum number of consecutive 1's are obtained only if we flip the 0's present
at position 3, 4, 5 (0 base indexing).
The array after flipping becomes [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0].
The number of consecutive 1's is 10.
  */
    public static int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int left = 0, right = 0;
        int zeros = 0;
        int maxlen = 0;

        while (right < len) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            int windowLength = right - left + 1;
            maxlen = Math.max(maxlen, windowLength);
            right++;
        }

        return maxlen;
    }




    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = longestOnes(ar,k);
        System.out.println("The number of consecutive 1 is  "+ans);


    }

    }
