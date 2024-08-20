class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        int t = flowerbed.length;
        for(int i=0;i<t;i++){
            if(flowerbed[i]==0){
                if((i==0 || flowerbed[i-1]==0) && (i==t-1 || flowerbed[i+1]==0)){
                    flowerbed[i] = 1;
                    n = n-1;
                }
                if(n==0){
                    return true;
                }
            }
        }
        return false;
    }
}