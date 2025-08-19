package SlidingWindowAnd2pointersProblem;

import java.util.Scanner;

import static java.lang.Math.max;


public class maximumPointsObtain {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []ar = new int[n];

        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int maxCnt = maximumCardPointObtain(ar,k);
        System.out.println("maximum point : "+maxCnt);


    }

    private static int maximumCardPointObtain(int[] ar, int k) {
        int lSum = 0, rSum = 0, maxSum = 0;
                for(int i=0;i<k;i++){
                    lSum = lSum + ar[i];
                }
                maxSum = max(maxSum,lSum);
                int n = ar.length;
             int    rightIndex = n-1;
             for(int i = k-1; i>=0; i--){
                 lSum = lSum- ar[i];
                 rSum = rSum + ar[rightIndex];
                 rightIndex--;
                 int q = lSum+rSum;
                 maxSum = max(maxSum, q);



             }
             return maxSum;
    }
}
