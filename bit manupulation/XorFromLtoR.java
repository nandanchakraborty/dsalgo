import java.util.Scanner;

public class XorFromLtoR {
    public static int xorOperation(int n){

        if(n% 4 == 1) return 1;
        if (n%4 == 2) return n+1;
        if(n%4 == 3 )return 0;
        if(n%4 == 0 ) return n;

        return 0;
    }
public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the range to do xor like L = ");
        int l = sc.nextInt();
    System.out.print(" R = ");
    int r = sc.nextInt();

    int left = xorOperation(l);
    int right = xorOperation(r);
    int answer = left ^ right;
    System.out.println("xor operation from L to R is "+answer );


}
}
