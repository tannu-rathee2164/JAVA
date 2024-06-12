import java.util.*;
public class Armstrong_num {
    public static boolean Is_Armstrong_Number(int n) {
        int num = n;
        int pow = CountOfDigit(n); 
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            sum += (int) Math.pow(rem,pow);
            n /= 10;
        }
        if(sum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static int CountOfDigit(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Is_Armstrong_Number(num));
    }
}