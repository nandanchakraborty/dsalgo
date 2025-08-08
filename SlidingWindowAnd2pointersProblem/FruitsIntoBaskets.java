package SlidilingWindowAnd2pointersProblem;

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Math.max;

public class FruitsIntoBaskets {

    public static int fruitsOnbaskets(int[] ar, int k) {
        int l = 0, r = 0, maxlen = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int len = ar.length;

        while (r < len) {
            mp.put(ar[r], mp.getOrDefault(ar[r], 0) + 1);

            if (mp.size() > k) {
                mp.put(ar[l], mp.get(ar[l]) - 1);
                if (mp.get(ar[l]) == 0) {
                    mp.remove(ar[l]);
                }
                l++;
            }

            if (mp.size() <= k) {
                maxlen = max(maxlen, r - l + 1);
            }

            r++;
        }

        return maxlen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = fruitsOnbaskets(ar, k);
        System.out.println("Highest number of fruits in the baskets is " + ans);
    }
}
/*Input : fruits = [1, 2, 3, 2, 2]

Output : 4

Explanation : we will start from second tree.

The first basket contains fruits from second , fourth and fifth.

The second basket will contain fruit from third tree.

Hence ,we collected total of 4 fruits.*/