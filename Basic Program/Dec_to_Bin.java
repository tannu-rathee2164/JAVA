import java.util.*;
public class Dec_to_Bin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int dec_num = sc.nextInt();  // Src base 10s
        int mul = 1;
        int bin_num = 0;
        while(dec_num > 0) {
            int rem = dec_num % 2;  // Base 2
            bin_num += rem * mul;
            mul *= 10;
            dec_num /= 2;
        }
        System.out.print("Binary Number: " + bin_num);
    }
}