class Solution {
    public boolean isSubsequence(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();
        int i =0;
        for(int j=0;j<t1;j++){
            if(i==s1){
                return true;
            }
            else{
                if(s.charAt(i)==t.charAt(j)){
                    i++;
                }
            }
        }
        return i==s1;
    }
}