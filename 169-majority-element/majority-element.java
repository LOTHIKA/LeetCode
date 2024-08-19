class Solution {
    public int majorityElement(int[] nums) {
        int target = -1 ;
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
             if(count ==0){
                target = nums[i];
                count++;
             }
             else if(nums[i]==target){
                count++;
             }
             else if(nums[i]!=target){
                count--;
             }
        }
        return target;
    }
}