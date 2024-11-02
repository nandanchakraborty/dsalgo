import java.util.Scanner;

public class Odd_number_of_a_number {
    //here u will be given an array.there will be every number occurs twice and only one will occur once
    //find the odd number

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size :");
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i =0;i<n;i++){
            array[i]  = sc.nextInt();
        }
        int number = 0;
        for(int i=0;i<n;i++){

            number = number ^ array[i];
        }
        System.out.println("odd number is : "+number);
    }
}
