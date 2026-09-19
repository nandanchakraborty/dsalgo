import java.util.Scanner;

public class CountSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        System.out.println("enter array ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter sub array sum");
        int sum = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int sub_sum = 0;
            for (int j = i; j < n; j++) {
                sub_sum = sub_sum + arr[j];


                if (sub_sum == sum) cnt++;
            }



        }
        System.out.println("Total subarray " + cnt);


    }
}