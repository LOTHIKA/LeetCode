class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int i =0;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    nums[i] = nums[i]*2;
                    nums[j] = 0;
                    i = j;
                }
                else{
                    i++;
                }
            }
            for(i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(nums[i]==0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            return nums;
    }
}