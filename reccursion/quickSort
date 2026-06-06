import java.util.Arrays;

public class Main{
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
    
    static void quickSort(int arr[], int low, int high){
        if(low >= high) return;
        
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        
        while(start <= end){
            while(pivot > arr[start]){
                start++;
            } 
            while(pivot < arr[end]){
                 end--;
            }
            if(start <= end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        quickSort(arr, start, high);
        quickSort(arr, low, end);
    }
    
    public static void main(String args[]){
        
        int arr[] = {2,4,1,5,7,9,1,0};
        quickSort(arr,0,arr.length-1);
       System.out.println(Arrays.toString(arr));
    }
}
