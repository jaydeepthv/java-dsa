import java.util.*;

public class Main{
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int getMaxIdx(int arr[], int n){
        int max = 0;
        for(int i = 1; i <= n; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    
    static void selectionSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIdx= getMaxIdx(arr, last);
            swap(arr , last, maxIdx);
            
        }
    }
    
    public static void main(String args[]){
        int arr[] = {-1,3,4,0,-5};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
        
    }
}
