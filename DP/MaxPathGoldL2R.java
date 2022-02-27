import java.util.Scanner;

public class MaxPathGoldL2R{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        }

        int dp[][] = new int[n][m];

        for(int j = n - 1; j >= 0; j--){
            for(int i = m - 1; i >= 0; i--){
                if( j == m - 1 ){
                    dp[i][j] = arr[i][j];
                } else if( i == 0 ){
                    dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j+1]) + arr[i][j];
                } else if( i == n - 1 ){
                    dp[i][j] = Math.max(dp[i][j+1], dp[i-1][j+1]) + arr[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j+1],Math.max(dp[i][j+1],dp[i+1][j+1])) + arr[i][j];
                }
            }
        }

        int res = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(dp[i][0] > res)
                res = dp[i][0];
        }

        System.out.println(res);

        sc.close();
    }
}