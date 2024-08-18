class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = jewels.length();
        int m = stones.length();
        int ans = 0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(stones.charAt(i)==jewels.charAt(j)){
                        ans++;
                    }
                }
            }
        return ans;
    }
}