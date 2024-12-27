class Solution {
    public int countSegments(String s) {
        int count = 0;
        boolean insegment = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                insegment = false;
            }
            else if(!insegment){
                count++;
                insegment = true;
            }
        }
        return count;
    }
}