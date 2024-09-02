import java.util.Scanner;

import static java.lang.Math.pow;

public class BitManupulation {
    public static void andOperator(int a,int b){
        int ans = a & b;
        System.out.println("and operation of two numbers = "+ans);

    }
    public static void orOperator(int a,int b){
        int ans = a | b;
        System.out.println("Or operation of two numbers = "+ans);

    }

    public static void rightShiftOperation(int a,int b){
        int ans = a >> b; /* that means a right shift by b amounts
        /*a=13 = 1101 anb b=2 that means 13 right shift by 2. a = 0011
        */
        double temp = Math.pow(2,b);
       double ans2 = a/temp;
        System.out.println("without rightshift formula = "+ans);
        System.out.println("with rightshift formula = "+ans2);


    }

    public static void leftShiftOperation(int a,int b){
        int ans = a << b; /* that means a right shift by b amounts
        /*a=13 = 1101 anb b=2 that means 13 right shift by 2. a = 110100
        */
        double temp = Math.pow(2,b);
        double ans2 = a*temp;
        System.out.println("without leftshift formula = "+ans);
        System.out.println("with leftshift formula = "+ans2);


    }

    public static void notOperator(int a){
        /*not operation works like first it flips all the digit the chekck
        it's a -ve or not .if it is -ve .the convert it into 2's compliment
        if  it's not -ve then its stop right there
         */
        int ans = ~(a);
        System.out.println("not operation = "+ans);

    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        andOperator(num1,num2);
        orOperator(num1,num2);
        rightShiftOperation(num1,num2);
        leftShiftOperation(num1,num2);
        notOperator(num1);

    }
}
