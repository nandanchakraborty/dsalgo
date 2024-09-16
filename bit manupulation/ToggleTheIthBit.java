import java.util.Scanner;

public class ToggleTheIthBit {
    //toggle means change the bit.if it 1 make it 0 and vice versa
    public static void toggleTheIthBit(int n,int i){
        int t = (n ^ (1 << i));
        System.out.println("after toggling the number is "+ t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number and bit number to toggle ");
        int n = sc.nextInt();
        int i = sc.nextInt();


        toggleTheIthBit(n, i);

    }
}
