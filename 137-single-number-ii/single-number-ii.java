class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        int sum;
        int x;
        int n = nums.length;
        for(int i=0;i<32;i++){
            sum =0;
            x = (1 << i);
            for(int j=0;j<n;j++){
                if((nums[j] & x)==x){
                    sum++;
                }
            }
            if(sum%3 !=0){
                result = result | x;
            }
        }
        return result;
    }
}