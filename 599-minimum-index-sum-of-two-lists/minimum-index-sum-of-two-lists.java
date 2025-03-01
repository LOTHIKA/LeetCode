class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
         HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int indexSum = i + map.get(list2[i]); 
                if (indexSum < minSum) {
                    ans.clear(); 
                    ans.add(list2[i]);
                    minSum = indexSum; 
                } else if (indexSum == minSum) {
                    ans.add(list2[i]); 
                }
            }
        }
        String[] arr = ans.toArray(new String[0]);

        return arr;
    }
}