import java.util.Scanner;

public class MatrixChainMul{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[][] dp = new int[arr.length-1][arr.length-1];

        for(int g = 0; g < dp.length; g++){
            for(int i = 0, j = g; j < dp.length; i++, j++){
                if( g == 0 ){
                    dp[i][j] = 0;
                } else if( g == 1 ){
                    dp[i][j] = arr[i] * arr[j] * arr[j+1];
                } else {
                    int min = Integer.MAX_VALUE;
                    for(int k = i; k < j; k++){
                        int leftCost = dp[i][k];
                        int rightCost = dp[k+1][j];
                        int mul = arr[i] * arr[k+1] * arr[j+1];
                        min = Math.min(min, leftCost + rightCost + mul);
                    }
                    dp[i][j] = min;
                }
            }
        }

        System.out.println(dp[0][dp.length - 1]);

        System.out.println();

        printMatrix(dp);
        sc.close();
        
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%12d", matrix[row][col]);
            }
            System.out.println();
        }
    }
}