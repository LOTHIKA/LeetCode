class Solution {
    public static void solve(int[] nums,int start,List<Integer> list,List<List<Integer>> result){
            result.add(new ArrayList<>(list));
            for(int i=start;i<nums.length;i++){
                if(i>start && nums[i]==nums[i-1]){
                    continue;
                }
                  list.add(nums[i]);
                  solve(nums,i+1,list,result);
                  list.remove(list.size()-1);
            }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,new ArrayList<>(),result);
        return result;
    }
}