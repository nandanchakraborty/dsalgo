import java.util.Scanner;

public class Find2DistinctNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }

        int rightmost = (int) (xorr & -xorr);
        int b1 = 0, b2 = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] & rightmost) != 0) {
                b1 = b1 ^ arr[i];
            } else {
                b2 = b2 ^ arr[i];
            }
        }

        System.out.println("Distinct two numbers are: " + b1 + " " + b2);
    }
}
