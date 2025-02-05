import java.util.Scanner;
import java.util.*;

public class PrintAllPrimeFactor {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<Integer>();
        for(int i=2;i<=sqrt(n);i++){
            if(n%i ==0){
                li.add(i);
                while(n%i==0){
                    n = n/i;
                }
            }

        }
        if(n!=1) li.add(n);

        System.out.println(li);
    }
}
