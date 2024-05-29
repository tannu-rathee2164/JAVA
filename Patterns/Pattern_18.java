import java.util.*;
public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int sp = n-1;
        int star = 1;
        while(row <= 2*n-1) {
            // Space
            int i = 1;
            while(i <= sp) {
                System.out.print("  ");
                i++;
            }
            // Star
            int j = 1;
            while(j <= star) {
                System.out.print("* ");
                j++;
            }
            // Mirror
            if(row < n) {
                star += 2;
                sp--;
            } else {
                star -= 2;
                sp++;
            }
            // Next Row
            row++;
            System.out.println();
        }
    }
}
