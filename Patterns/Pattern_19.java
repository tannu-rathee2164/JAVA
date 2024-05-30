import java.util.*;
public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int sp = 1;
        while(row <= 2*n-1) {
            // Star
            int i = 1;
            if(row == 1 || row == 2*n-1) {
                i = 2;
            }
            while(i <= star) {
                System.out.print("* ");
                i++;
            }
            // Space
            int j = 2;
            while(j < sp) {
                System.out.print("  ");
                j++;
            }
            // Star
            int k = 1;
            while(k <= star) {
                System.out.print("* ");
                k++;
            }
            // Mirror
            if(row < n) {
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
