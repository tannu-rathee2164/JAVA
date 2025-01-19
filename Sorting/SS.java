public class SS {
    public static void BubbleSort(int[] arr) {
        for(int turn=1; turn<arr.length ; turn++) {
            for(int j = 0 ; j<arr.length-turn ; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    #include<iostream>
    using namespace std;
    
    int main() {
        int max_emp;
        string emp_name;
        string att;
        int present = 0;
        int absent = 0;
        cout<<"How many employee data you want to enter: ";
        cin>>max_emp;
        
        while(max_emp > 0) {
            cout<< "emp_name: ";
            cin>>emp_name;
            cout<< "P for present & A for absent: ";
            cin>>att;
            if(att == "P") {
                present++;
            } else {
                absent++;
            }
            max_emp--;
        }
        cout<<"Total present employees are: " << present << endl;
        cout<<"Total absent employees are: " << absent;
    
        return 0;
    }


    
    public static void main(String[] args) {
        int[] arr = {5 , 3 , -7 , 4 , 8 , 2};
        BubbleSort(arr);
        for(int i=0; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}