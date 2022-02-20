import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j+1] < arr[j]){
                    System.out.println("Swapping "+arr[j+1]+" "+arr[j]);
                    swap(arr, j+1 ,j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
