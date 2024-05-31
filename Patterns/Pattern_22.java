import java.util.*;
public class Pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        while(row <= n) {
            // Star (1 row  & last row)
            if(row == 1 || row == n) {
                int i = 1;
                while(i <= star) {
                    System.out.print("* ");
                    i++;
                }
            } else {
                // star space star (from 2nd to n-1 row) =>  *       *
                System.out.print("* ");  // Star
                int j = 1;
                while(j < n-1) { // spaces
                    System.out.print("  ");
                    j++;
                }
                System.out.print("* "); // Star
            }
            
            row++;
            System.out.println();
        }
    }
}