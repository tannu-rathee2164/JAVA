import java.util.*;
public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int sp = 0;
        while(row <= 2*n-1) {
            // Space
            int i = 1;
            while(i <= sp) {
                System.out.print("  ");
                i++;
            }
            // star
            int j =1;
            while(j <= star) {
                System.out.print("* ");
                j++;
            }
            // Mirror
            if (row < n) {
                star--;
                sp += 2;
            } else {
                star++;
                sp -= 2;
            }
            // Next row
            row++;
            System.out.println();
        }
    }
}
