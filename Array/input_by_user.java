import java.util.*;
public class input_by_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<arr.length ; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.print("Address of array is: " + arr);
    }
}
