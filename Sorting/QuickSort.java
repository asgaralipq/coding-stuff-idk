import java.util.Arrays;
import java.util.Scanner;

public class QuickSort{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void quickSort(int[] arr, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }

        int pivot = partition(arr, lowIndex, highIndex);
        quickSort(arr, lowIndex, pivot - 1);
        quickSort(arr, pivot + 1, highIndex);
    }

    private static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int high = right;

        while(left < right){
            while(arr[left] <= pivot && left < right){
                left++;
            }

            while(arr[right] >= pivot && left < right){
                right--;
            }

            swap(arr, left, right);
        }
        swap(arr, left, high);

        return left;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}