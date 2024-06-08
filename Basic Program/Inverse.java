import java.util.*;
public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = 1;
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum += (int) pos * Math.pow(10 , rem - 1);
            num /= 10;
            pos++;
        }
        System.out.println(sum);
    }
}
