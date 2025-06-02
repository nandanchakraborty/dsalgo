package SlidilingWindowAnd2pointersProblem;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacter {

    static int subStringFunc(String s) {
        int n = s.length();
        int l = 0, r = 0, len = 0;
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

        while (r < n) {
            if (mp.containsKey(s.charAt(r)))
                l = Math.max(mp.get(s.charAt(r)) + 1, l);

            mp.put(s.charAt(r), r);
            len = Math.max(len,r-l+1);
            r++;

        }


        
        return len;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
       int t =  subStringFunc(s);
       System.out.println("the length of longest sub string with no repeating character" +
               "is "+t+ "  "+s);

    }

}
