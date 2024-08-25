//Learning java hashmap

import java.util.HashMap;
import java.util.Scanner;


public class hashmap {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = ar[i];
            int freq = 0;
            if(mp.containsKey(key)) freq = mp.get(key);
            freq++;
            mp.put(key,freq);
        }

        int q ;
        q = sc.nextInt();
        while(q-->0){
            int num ;
            num = sc.nextInt();
            if(mp.containsKey(num)) System.out.println(mp.get(num));
            else System.out.println(0);

        }



    }
}
