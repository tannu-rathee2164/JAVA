import java.util.Scanner;
public class Arr_display {
    public static void display(int arr[]) {
        for(int i=0 ; i<arr.length ; i++) {  // print array element 
            System.out.println( "arr[" + i + "] = " + arr[i]);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // size of array
        int arr[] = new int[n];
        for(int i=0 ; i<arr.length ; i++) {  // enter values of array
            arr[i] = sc.nextInt();
        }
        display(arr);
    }
}