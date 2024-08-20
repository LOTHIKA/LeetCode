class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int count =1;
        List<Character> list = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(chars[i]==chars[i+1]){
                count++;
            }
            else{
                list.add(chars[i]);
                if(count > 1){
                    for(char digit : Integer.toString(count).toCharArray())
                       list.add(digit);
                }
                count = 1;
            }
        }
        list.add(chars[n-1]);
        if(count > 1){
            for(char digit : Integer.toString(count).toCharArray())
                    list.add(digit);
        }
        for(int i=0;i<list.size();i++){
            chars[i] = list.get(i);
        }
        return list.size();
    }
}