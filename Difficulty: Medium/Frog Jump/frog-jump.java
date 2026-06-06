class Solution {
    int f(int i,int[] h,int[] dp){
        if(i==0) return dp[i]=0;
        if(dp[i]!=-1) return dp[i];
        int one=Math.abs(h[i]-h[i-1])+f(i-1,h,dp);
        int two=Integer.MAX_VALUE;
        if(i>1){
            two=Math.abs(h[i]-h[i-2])+f(i-2,h,dp);
        }
        return dp[i]=Math.min(one,two);
    }
    int minCost(int[] h) {
        // code here
        int n=h.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int ans=f(n-1,h,dp);
        return ans;
        
    }
}