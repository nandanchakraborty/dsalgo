import java.util.Scanner;

class CheckAnumberOddorNot {
    public static void main(String[] args) {
        System.out.println("Enter number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(( a & (a-1) )== 0) {
            System.out.println("The given number is power of 2");
        }
            else System.out.println("The given number is not power of 2");



        }
    }

