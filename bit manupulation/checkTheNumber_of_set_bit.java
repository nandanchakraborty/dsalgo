import java.util.Scanner;
//count the number of set bits
public class checkTheNumber_of_set_bit {

 public static void bruteForceWay(int n){
      int cnt =0;
        while(n > 1){
            if(n%2 == 1){
                cnt++;
                n = n/2;
            }
            else n = n/2;
        }
        if(n == 1) cnt++;
        System.out.println("brute force way "+cnt);

    }
  public static    void optimizeWay(int n) {
         int cnt =0;
        while (n != 0) {
            n = n & (n - 1);
            cnt++;
        }

    System.out.println("optimize way "+cnt);

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int cnt =0;

        System.out.println("Enter a number :");
        int n = sc.nextInt();
        bruteForceWay(n);
        optimizeWay(n);


    }
}
