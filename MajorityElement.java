//Find the elements that appears more than N/3 times
// in the array;if n=6 then n/3 =2 that means u have to return at most
//2 elements

import java.util.*;
import java.util.Scanner;


public class MajorityElement {
    public static List<Integer> majorityelement(int []v){
        int l = v.length;
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int mini = (int)(l/3)+1;
        for(int i=0;i<l;i++){
            int value = mpp.getOrDefault(v[i],0);
            mpp.put(v[i],value+1);

            if(mpp.get(v[i])== mini)
                ls.add(v[i]);

             if(ls.size() == 2)  break;
        }




        return ls;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter element number");
        int n = sc.nextInt();
        int []arr = new int[n];


        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = majorityelement(arr);
        System.out.print("the majority elements are : ");
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }


    }
}
