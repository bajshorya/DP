package DP;

import java.util.Arrays;

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
    public static int minimumEnergyTabulation(int arr[],int n){
      
         
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[0]=0;
        dp[0] = 0;
        
        for (int i = 1; i < n; i++) {
            int jumpTwo=Integer.MAX_VALUE;
            int jumpOne = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            if (i>1){
                jumpTwo=dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            }
            dp[i] = Math.min(jumpOne, jumpTwo);
        }
        
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int arr[]={30,10,60,10,60,50};
        int n=6;
        int a=minimumEnergyTabulation(arr, n);
        System.out.println(a);
    }
}
