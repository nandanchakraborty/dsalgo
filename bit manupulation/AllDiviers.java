import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllDiviers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                li.add(i);

            }
        }
        li.add(n);
        System.out.println(li);


    }
}
