import java.util.Scanner;

public class ClearTheIthBit {
    //clear the ith bit means if the bit is set to 1 make it 0
    /*
 i=2; 1<<2  = 0100
      n= 13 = 1101
     ~(1<<2)= 1011
        ------------
           &  1001
     */
    public static void clearTheIthBit(int n,int i){
        int t = (n & ~(1 << i));
        System.out.println("after clear the ith bit "+ t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number and bit number to clear ");
        int n = sc.nextInt();
        int i = sc.nextInt();


        clearTheIthBit(n, i);

    }
}
