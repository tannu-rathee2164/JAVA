public class Selection_Sort {
    public static void SelectionSort(int[] arr) {
        for(int i=0 ; i<arr.length ; i++) {
            int min = i;
            for(int j=i+1 ; j < arr.length ; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5 , 3 , -7 , 4 , 8 , 2};
        SelectionSort(arr);
        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}