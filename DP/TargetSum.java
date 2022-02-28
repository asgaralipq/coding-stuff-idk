import java.util.Scanner;

public class TargetSum{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        boolean dp[][] = new boolean[n+1][target+1];

        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < target + 1; j++){
                if(i == 0 & j == 0){
                    dp[i][j] = true;
                } else if(i == 0 && j != 0){
                    dp[i][j] = false;
                } else if(i != 0 && j == 0){
                    dp[i][j] = true;
                } else {
                    if(dp[i - 1][j] == true){
                        dp[i][j] = true;
                    } else {
                        int val = arr[i - 1];
                        if(j >= val){ 
                            dp[i][j] = dp[i - 1][j - val];
                        } else {
                            dp[i][j] = dp[i - 1][j];
                        }
                    }
                }
            }
        }

        System.out.println(dp[n][target]);

        sc.close();
    }
}