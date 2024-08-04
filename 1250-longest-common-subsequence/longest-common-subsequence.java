class Solution {
    public int LCS(String s1,String s2,int i,int j,int[][] dp){
        if(i==-1||j==-1){
            return 0;
        }
        if(dp[i+1][j+1]!=-1){
            return dp[i+1][j+1];
        }
        else if(s1.charAt(i)==s2.charAt(j)){
            dp[i+1][j+1]=1+LCS(s1,s2,i-1,j-1,dp);
        }
        else{
            dp[i+1][j+1]=Math.max(LCS(s1,s2,i,j-1,dp),LCS(s1,s2,i-1,j,dp));
        }
        return dp[i+1][j+1];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp= new int[n+1][m+1];
        int i,j;
        for(i=0;i<=n;i++){
            for(j=0;j<=m;j++){
                dp[i][j]=-1;
            }
        }
        return LCS(text1,text2,n-1,m-1,dp);
    }
}