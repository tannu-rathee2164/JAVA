import java.util.*;
public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int sp = 1;
        while(row <= n) {
            // star
            int i =1;
            while(i <= star) {
                System.out.print("* ");
                i++;
            }
            // Space
            int j = 2;
            while (j < sp) {
                System.out.print("  ");
                j++;
            }
            // star
            int k = 1;
            if(row == 1) {
                k = 2;
            }
            while(k <= star) {
                System.out.print("* ");
                k++;
            }
            row++;
            sp += 2;
            star--;
            System.out.println();
        }
    }
}