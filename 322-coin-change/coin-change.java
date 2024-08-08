class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp = new int[n][amount+1] ;
        int i,j;
        for(i=0;i<=n-1;i++)
        {
            for(j=0;j<=amount;j++)
            {
                if(i==0)
                {
                    if(j%coins[i]==0)
                    {
                        dp[i][j] = j/coins[i]; 
                    }
                    else 
                    {
                        dp[i][j] = Integer.MAX_VALUE/2;
                    }
                }
                else {
                int take=Integer.MAX_VALUE/2,not_take; 
                not_take = 0 + dp[i-1][j]; 
                if(coins[i]<=j)
                {
                  take = 1+dp[i][j-coins[i]]; 
                }
                dp[i][j] = Math.min(take,not_take); 
                }
            }
        }
        if(dp[n-1][amount]!=Integer.MAX_VALUE/2){
            return dp[n-1][amount];
        }
        else{
        return -1;
        }
    }
}
