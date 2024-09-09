import java.util.Scanner;

public class SetTheIthBIt {
    public static void leftShiftOperator(int n, int i){
        /*suppose n = 13 so the binary of 13 = 1101
        now i =2 .left shift of 13<<2  0100
        now u can do 1<<2  and with 13 binary .1<<2 = 100
        1101
      & 0100
     -----------
       =0100

         */
        if((n & (1 << i))!=0){
            System.out.println("The ith bit is set");
        }
        else System.out.println("The ith bit is not set");
    }

    public static void RightShiftOperator(int n,int i){
         /*suppose n = 13 so the binary of 13 = 1101
        now i =2 .right shift of 13>>2  0011
        now u can do 1>>2  and with 13 binary 1>>2 = 001

         */
        if(((n>>i) & 1)!=0){
            System.out.println("The ith bit is set");

        }
        else System.out.println("The ith bit is not set");

    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number and bit number to set ");
        int n = sc.nextInt();
        int i = sc.nextInt();

        /* u can do it by using left shift operator and right shift operator

         */
        leftShiftOperator(n,i);
        RightShiftOperator(n,i);
    }
    
}
