import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllSubset {

    public static List<List<Integer>> subset(int[] ar, int n) {
        int numberOfSubset = 1 << n;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numberOfSubset; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    list.add(ar[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> subsets = subset(arr, n);

        System.out.println("All subsets are:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }

        sc.close();
    }
}
