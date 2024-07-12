package DP;
public class climbingStairs {
    public int climbingStairs(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <=n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        //  if (n == 0 || n == 1) {
        //     return 1;
        // }
        
        // int prev1 = 1;
        // int prev2 = 1;
        // int current = 0;
        
        // for (int i = 2; i <= n; i++) {
        //     current = prev1 + prev2;
        //     prev2 = prev1;
        //     prev1 = current;
        // }
        
        // return current;

// public int climbStairs(int n) {
//         int[] memo = new int[n + 1];
//         return climbStairsMemo(n, memo);
//     }
    
//     private int climbStairsMemo(int n, int[] memo) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }
        
//         if (memo[n] != 0) {
//             return memo[n];
//         }
        
//         memo[n] = climbStairsMemo(n - 1, memo) + climbStairsMemo(n - 2, memo);
//         return memo[n];


        
   }
    public static void main(String[] args) {
        
    }
}
