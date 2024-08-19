class Solution {
    public boolean isSubsequence(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();
        int si =0;
        int ti=0;
        while(si<s1 && ti<t1){
            if(s.charAt(si)==t.charAt(ti)){
                si++;
            }
            ti++;
        }
        return si==s1;
    }
}