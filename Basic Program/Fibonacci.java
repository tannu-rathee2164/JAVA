import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int third = 0;
        System.out.print(first + " " + second + " ");
        for(int i=2 ; i<=n ; i++) {
            third = first + second;
            // Swap
            first = second;
            second = third;
            System.out.print(third + " ");
        }
        
    }
}
