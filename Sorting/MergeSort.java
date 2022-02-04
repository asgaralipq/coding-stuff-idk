import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    private static void mergeSort(int[] arr){
        mergeSort(arr, arr.length);
    }

    private static void mergeSort(int[] arr, int len){
        if(len < 2)
            return;

        int mid = len/2;

        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[len-mid];

        for(int i = 0; i < mid; i++){
            leftHalf[i] = arr[i];
        }

        for(int i = mid; i < len; i++){
            rightHalf[i - mid] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);

    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;


        System.out.println(Arrays.toString(leftHalf));
        System.out.println(Arrays.toString(rightHalf));

        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }else{
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            arr[k] = leftHalf[i];
            k++;
            i++;
        }
        while(j < rightSize){
            arr[k] = rightHalf[j];
            k++;
            j++;
        }
    }
}

