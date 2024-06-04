import java.util.*;
public class Bin_to_Dec {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int bin_num = sc.nextInt();  // Src base 2
        int mul = 1;
        int dec_num = 0;
        while(bin_num > 0) {
            int rem = bin_num % 10;  // destination Base 10
            dec_num += rem * mul;
            mul *= 2;
            bin_num /= 10;
        }
        System.out.print("Decimal Number: " + dec_num);
    }
}