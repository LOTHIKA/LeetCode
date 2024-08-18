class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String str : strs ){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String words =new String(ch);
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