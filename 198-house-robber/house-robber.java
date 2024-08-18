class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        return solve(nums,0,dp);
    }
    public int solve(int[] nums,int i,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        else{
            int take = 0;int not_take;
            not_take = solve(nums,i+1,dp);
            take = nums[i] + solve(nums,i+2,dp);
            dp[i] = Math.max(take,not_take);
        }
        return dp[i];
    }
}