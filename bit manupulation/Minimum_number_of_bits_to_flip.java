import java.util.Scanner;

public class Minimum_number_of_bits_to_flip {
    //here u will be given two number .start and goal.u have to convert the start
    // value into goal value and  return the
    //number of bits flipped

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start and goal value : ");
        int start = sc.nextInt();
        int goal = sc.nextInt();

        int answer = start ^ goal;
        int cnt =0;
        while(answer != 0){
            answer = answer & (answer-1);
            cnt++;

        }
        System.out.println("Minimum number of flipped bits is "+cnt);
    }
}
