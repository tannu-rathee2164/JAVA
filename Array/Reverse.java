public class Reverse {
    public static void reverse_array(int arr[]) {
        int first = 0;
        int last = arr.length-1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 30 , 40 , 50};
        reverse_array(arr);

        for(int i=0 ; i<arr.length ; i++) {  // print array element 
            System.out.println( "arr[" + i + "] = " + arr[i]);
        }
    }
}
