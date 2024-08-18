public class Largest_Smallest {
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int smallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {2 , 5 , 7 , 9 , 1};
        System.out.println("Maximum value is: " + largest(arr));
        System.out.println("Minimum value is: " + smallest(arr));
    }
}
