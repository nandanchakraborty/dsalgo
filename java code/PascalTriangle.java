//These problem has three variation
//1.Given row number r and column number c.print the element at rc in pascal triangle
//2.Given the row number n .print the n-th row of pascal triangle
//3.Given the row number .Print the first n rows of pascal triangle.


//number 2 solution is in the function and number 3 is the entire code
import java.util.Scanner;

public class PascalTriangle {
    static void generate_row(int p){

        //solution of number 2;
        int ans = 1;

        System.out.print(ans+" ");
        for(int i=1;i<p;i++){
            ans = ans*(p-i);
            ans = ans/i;
            System.out.print(ans+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        System.out.println("enter the row number");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            generate_row(i);
        }



    }
}
