import java.util.*;
public class Pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int sp = n-1;
        int sp2 = -1;
        while(row <= n) {
            // Space
            int i = 1;
            while(i <= sp) {
                System.out.print("  ");
                i++;
            }
            // Star
            System.out.print("* ");

            // Space
            int k = 1;
            while(k <= sp2) {
                System.out.print("  ");
                k++;
            }
            // Star
            if(row > 1 && row < n){
                System.out.print("* ");
            }
            
            // Next Row
            if(row <= n/2) {
                sp--;
                sp2 += 2;
            } else {
                sp++;
                sp2 -= 2;
            }
            row++;
            System.out.println();
        }
    }
}
