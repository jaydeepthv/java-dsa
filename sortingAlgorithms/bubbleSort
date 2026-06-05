import java.util.*;

public class Main{
    static void swap(int arr[], int i, int j ){
        int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        
    }
    static void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            boolean swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if(swapped == false){
                    return;
                }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,1,25,43,1,0,7,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
