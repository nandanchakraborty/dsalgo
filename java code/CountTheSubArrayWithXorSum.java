import java.util.HashMap;
import java.util.Scanner;

public class CountTheSubArrayWithXorSum {
    public static int xorsum(int []ar,int k){
        HashMap<Integer , Integer> mp = new HashMap<>();
        int n = ar.length;
        int xr = 0;
        mp.put(xr,0);
        int cnt =0 ;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ ar[i];

            //By formula: x = xr^k:
            int x = xr ^ k;

            // add the occurrence of xr^k
            // to the count:
            if (mp.containsKey(x)) {
                cnt += mp.get(x);
            }

            // Insert the prefix xor till index i
            // into the map:
            if (mp.containsKey(xr)) {
                mp.put(xr, mp.get(xr) + 1);
            } else {
                mp.put(xr, 1);
            }
        }
        return cnt;
    }









    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        int ans = xorsum(ar,sum);
        System.out.println("The number of sub array"+ans);
    }
}
