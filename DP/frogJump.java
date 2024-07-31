package DP;

public class frogJump {
    public static int minimumEnergy(int arr[],int n){
        //code here
        if (n == 1) {
            return 0;
        }
         
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(arr[1] - arr[0]);
        for (int i = 2; i < n; i++) {
            int oneStep = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            int twoStep = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            dp[i] = Math.min(oneStep, twoStep);
        }
        
        return dp[n - 1];
    }
    public static void main(String[] args) {
        
    }
}
