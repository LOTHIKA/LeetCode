class Solution {
    public int findComplement(int num) {
        String n = Integer.toBinaryString(num);
        String res = "";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='0'){
                res+="1";
            }
            else{
                res+="0";
            }
        }
        return Integer.parseInt(res,2);
    }
}