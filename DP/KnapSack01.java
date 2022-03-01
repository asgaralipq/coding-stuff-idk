import java.util.Scanner;

public class KnapSack01{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] weight = new int[n];
        int[] val = new int[n];

        for(int i = 0; i < n; i++){
            weight[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            val[i] = sc.nextInt();
        }

        int capacity = sc.nextInt();

        int dp[][] = new int[n+1][capacity+1];

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < capacity + 1; j++){
                if(j < val[i - 1]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max( (weight[i - 1] + dp[i - 1][j - val[i - 1]]), dp[i - 1][j]);
                }
            }
        }


        System.out.println(dp[n][capacity]);

        sc.close();
    }
}