import java.util.Scanner;

public class ClearTheRightMostSetBit {
    //101100 clear the right most set bit means 101000
    /*
    n= 13 = 1101 //it is given by user
    n=12  = 1100
  -----------------------
  & opera = 1100 (this is how it works to set the given number last set bit
     */

    public static void clearTheRightMostSetBit(int n){
        int t = n & (n-1);
        System.out.println("after clearing the right most set bit "+t);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number  ");
        int n = sc.nextInt();

        clearTheRightMostSetBit(n);


    }
}
