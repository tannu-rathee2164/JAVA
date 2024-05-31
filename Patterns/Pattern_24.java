import java.util.*;
public class Pattern_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int sp = n-1;
        while (row <= n) {
            int i = 1;
            while(i <= sp) {
                System.out.print("   ");
                i++;
            }
            int j = 1;
            int val = 1;
            while(j <= star) {
                System.out.print(val + "  ");
                if(j <= star/2) {
                    val++;
                } else {
                    val--;
                }
                j++;
            }
            star += 2;
            sp--;
            row++;
            
            System.out.println();
        }
    }
}
