public class BubbleSort {
    public static void bubble_sort(int arr[]) {
        for(int turn = 1; turn < arr.length ; turn++ ) {
            for(int i = 0 ; i < arr.length - turn ; i++ ) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5 , 1 , -7 , 9 , 3};
        bubble_sort(arr);
        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}