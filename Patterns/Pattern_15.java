import java.util.*;
public class Pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int sp = n-1;
        while (row <= 2*n-1) {
            // space
            int i = 1;
            while(i <= sp) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while(j <= star) {
                System.out.print("* ");
                j++;
            }
            // mirror 
            if(row < n) {
                sp--;
                star++;
            } else {
                sp++;
                star--;
            }
            // next row
            row++;
            System.out.println();
        }
    }
}