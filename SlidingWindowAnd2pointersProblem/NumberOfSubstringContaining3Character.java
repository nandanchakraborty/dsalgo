package SlidingWindowAnd2pointersProblem;

import java.util.Scanner;

import static java.lang.Math.min;

public class NumberOfSubstringContaining3Character {
    private static int countTheSubString(String s) {
        int n = s.length();
        int count =0;
        /*
         bruteforce way;
        for(int i=0;i<n;i++){
            int [] hash = new int[3];
            for(int j=i;j<n;j++){
                hash[s.charAt(j) - 'a'] = 1;

                if(hash[0] +hash[1]+hash[2] ==  3){
                    count++;
                }
            }
        }

       */

            int[] ls = new int[]{ -1, -1, -1 };
        for(int i =0;i<n;i++){
            ls[s.charAt(i) -'a'] = i;
            if(ls[0] != -1  &&  ls[1] != -1 && ls[2] != -1 ){
                count = count+(1+min(ls[0],min(ls[1],ls[2])));

            }


        }


        return count;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans= countTheSubString(s);
        System.out.println("total sub array :"+ans);

    }


}
/*Given a string s consisting only of characters a, b and c.
Return the number of substrings containing at least one occurrence of
all these characters a, b and c.
 */

