class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0,k=0;int j=n;int entry=1;
        int arr[]=new int[nums.length];
        while(i<n)
        {
            if(entry==1){
            arr[k++]=nums[i++];
            entry=0;}
            else{
            arr[k++]=nums[j++];
            entry=1;}
        }
        arr[arr.length-1]=nums[nums.length-1];
        return arr;
    }
}