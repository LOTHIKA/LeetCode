class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        // for(int nums : arr){
        //     if(mp.containsKey(nums)){
        //         int count = mp.get(nums);
        //         mp.put(nums, count+1);
        //     }
        //     else{
        //         mp.put(nums,1);
        //     }
        // }
        for (int num : arr) {
             int currentCount = mp.getOrDefault(num, 0);
             int newCount = currentCount + 1;
             mp.put(num, newCount);
        }
        HashSet<Integer> set = new HashSet<>(mp.values());
        if(mp.size()==set.size()){
            return true;
        }
        return false;
    }
}