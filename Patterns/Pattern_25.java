import java.util.*;
public class Pattern_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int sp = n-1;
        int val = 1;
        while(row <= n) {
            // Space
            int i = 1;
            while(i <= sp) {
                System.out.print("  ");
                i++;
            }
            // Value
            int j = 1;
            int p = val;
            while(j <= star) {
                System.out.print(p + " ");
                if(j <= star/2) {
                    p++;
                } else {
                    p--;
                }
                j++;
            }
            // Mirror
            if(row <= n/2) {
                star += 2;
                sp--;
                val++;
            } else {
                star -= 2;
                sp++;
                val--;
            }
            row++;
            System.out.println();
        }
    }
}
