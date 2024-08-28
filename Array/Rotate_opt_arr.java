// LeetCode problem : 189
public class Rotate_opt_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        Rotate(arr,k);
        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Rotate(int[] arr , int k) {
        int n = arr.length;
        k = k % n;
        Reverse(arr, 0 ,n-k-1);  // 1st 0 to n-k element
        Reverse(arr, n-k , n-1);   // last k element
        Reverse(arr, 0 , n-1);   // complete array
    }
    
    public static void Reverse(int[] arr , int i , int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
