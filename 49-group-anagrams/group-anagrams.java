class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String str : strs ){
            int[] input = new int[26];
            for(int i=0;i<str.length();i++){
                input[str.charAt(i) - 'a']++;
            }
            String words = Arrays.toString(input);
            if(mp.containsKey(words)){
                mp.get(words).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                mp.put(words,list);
            }
        }
        result.addAll(mp.values());
        return result;
        
    }
}