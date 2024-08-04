class Solution {
    public String reversePrefix(String word, char ch) {
        String ans = "";
        String rev = "";
        int n = word.length();
        for(int i = 0; i < n; i++) {
            if(word.charAt(i) != ch) {
                ans = ans + word.charAt(i);
            } 
            else{
                ans = ans + word.charAt(i);
                for(int j = 0; j < ans.length(); j++) { 
                    char c = ans.charAt(j); 
                    rev = c + rev;
                }
                ans = rev;
                for(int j = i + 1; j < n; j++) {
                    ans = ans + word.charAt(j);
                }
                break;  
            }
        }
        return ans;
    }
}