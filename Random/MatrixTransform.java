import java.util.*;
public class MatrixTransform{

    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        matrix = matrixScan(matrix, m, n);

        matrixPrint(matrix);

        int[][] newMatrix = matrixTransform(matrix, m, n);

        matrixPrint(newMatrix);

    }

    public static int[][] matrixTransform(int[][] matrix, int m, int n){

        if(m == n) return matrix;

        int b = m > n ? m : n;

        int[][] newMatrix = new int[b][b];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                    newMatrix[i][j] = matrix[i][j]; 
            }
        }

        for(int i = b - 1; i >= (m < n ? m : 0); i--){
            // System.out.println("i "+i);
            for(int j = b - 1; j >= (m < n ? 0 : n); j--){
                // System.out.println("j "+j);
                if(newMatrix[i][j] == 0)
                    newMatrix[i][j] = 1; 
            }
        }
        
        return newMatrix;
    }

    public static int[][] matrixScan(int[][] matrix, int m, int n){

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        return matrix;
    }

    public static void matrixPrint(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}