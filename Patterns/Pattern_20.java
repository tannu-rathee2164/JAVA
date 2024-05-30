import java.util.*;
public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n/2+1;
        int sp = -1;
        while(row <= n) {
            // Star
            int i = 1;
            while(i <= star) {
                System.out.print("* ");
                i++;
            }
            // Space
            int j = 1;
            while(j <= sp) {
                System.out.print("  ");
                j++;
            }
            // Star
            int k = 1; 
            if(row == 1 || row == n) {
                k = 2;
            }
            while(k <= star) {
                System.out.print("* ");
                k++;
            }
            // Mirror
            if(row <= n/2) {
                star--;
                sp += 2;
            } else {
                star++;
                sp -= 2;
            }
            // Next Row
            row++;
            System.out.println();

        }
    }
}
