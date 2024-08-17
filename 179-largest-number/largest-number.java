class Solution {
    public String largestNumber(int[] nums) {
       int n = nums.length;
       String[] str = new String[n];
       for(int i=0;i<n;i++){
           str[i] = String.valueOf(nums[i]);
       }
       Arrays.sort(str, new Comparator<String>()
       {
            public int compare(String s1, String s2){
                String left = s1+s2;
                String right = s2+s1;
                return right.compareTo(left);
            }
       });
       StringBuilder sb = new StringBuilder();
       for(String num : str){
           sb.append(num);
       }
       while(sb.charAt(0)=='0' && sb.length()>1 ){
        sb.deleteCharAt(0);
       }
       return sb.toString();
    }
}