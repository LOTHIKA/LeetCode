class Solution {
    public String largestNumber(int[] nums) {
       int n = nums.length;
       String[] str = new String[n];
       for(int i=0;i<n;i++){
           str[i] = String.valueOf(nums[i]);
       }
       Arrays.sort(str, (a,b)->(b+a).compareTo(a+b));
       StringBuilder sb = new StringBuilder();
       for(String num : str){
           sb.append(num);
       }
       while(sb.charAt(0)=='0' && sb.length()>1){
        return "0";
       }
       return sb.toString();
    }
}