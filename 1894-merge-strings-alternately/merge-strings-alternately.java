class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        String result = "";
        int len = Math.max(w1,w2);
        for(int i=0;i<len;i++){
            if(i<w1){
                result +=word1.charAt(i);
            }
            if(i<w2){
                result +=word2.charAt(i);
            }
        }
        return result;
    }
}