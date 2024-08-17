class Solution {

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String shortestPalindrome(String s) {

        if (s.length() <= 1) {
            return s;
        }

    
        int end = 0;
        for (int i = s.length(); i >= 0; i--) {
            if (isPalindrome(s.substring(0, i))) {
                end = i;
                break;
            }
        }

        
        String suf = s.substring(end);
        String rev = new StringBuilder(suf).reverse().toString();

        
        return rev + s;
    }
}