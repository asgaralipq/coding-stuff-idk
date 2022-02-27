import java.util.Scanner;

public class ClimbingStairsMinJump{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Integer[] dp = new Integer[n+1];

        dp[n] = 0;

        for(int i = n-1; i >=0; i--){
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;
                // System.out.println("dp[i] "+i);
                for(int j = i + 1; j <= (i+arr[i]) && j < dp.length; j++){
                    if(dp[j] != null){
                        // System.out.println("Comparing "+min+" "+dp[j]);
                        min = Math.min(min, dp[j]);
                    }
                }

                if(min != Integer.MAX_VALUE){
                    dp[i] = min + 1;
                }

                // System.out.println("min is "+dp[i]);
            }
        }

        System.out.println(dp[0]);

        sc.close();
    }
}