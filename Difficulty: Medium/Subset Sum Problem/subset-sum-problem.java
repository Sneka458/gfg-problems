class Solution {
    static int f(int i,int target,int[] arr,int[][]dp){
        if(target==0) return 1;
        if(i==0){
            return dp[i][target]=(arr[0]==target)?1:0;
            }
        if(dp[i][target]!=-1) return dp[i][target];
        int notpick=f(i-1,target,arr,dp);
        int pick=0;
        if(arr[i]<=target){
            pick=f(i-1,target-arr[i],arr,dp);
        }
        return dp[i][target]=Math.max(pick,notpick);
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][sum+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int cnt=f(n-1,sum,arr,dp);
        if(cnt>0) return true;
        return false;
    }
}