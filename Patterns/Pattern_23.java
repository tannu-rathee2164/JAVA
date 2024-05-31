import java.util.*;
public class Pattern_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int sp = n-1;
        int val = 1;
        while (row <= n) {
            int i = 1;
            while(i <= sp) {
                System.out.print("\t");
                i++;
            }
            int j = 1;
            while(j <= star) {
                System.out.print(val + "\t");
                val++;
                j++;
            }
            star += 2;
            sp--;
            row++;
            
            System.out.println();
        }
    }
}
