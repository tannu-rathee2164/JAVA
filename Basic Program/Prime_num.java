import java.util.*;
public class Prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i=2; i<num; i++) { 
            if(num % i == 0) {
                count++;
                break;
            }
        }
        if(count == 1) {
            System.out.print(num + " is Not Prime"); // Composite Number
        } else {
            System.out.print(num + " is Prime Number"); // Prime Number
        }
    }
}