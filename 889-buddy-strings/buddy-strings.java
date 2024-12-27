class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() !=goal.length())  return false;
        if(s.equals(goal)){
            for(int i =0 ; i < s.length() ;i++){
                String temp = s.substring(0 , i ) + s.substring(i+1 , s.length());
                if(-1!=temp.indexOf(s.substring(i , i+1)))      return true;  
            }
            return false;
        }
        char[] s1 = new char [2];
        char[] s2 = new char [2]; 
        int index = 0 , count = 0  ;
        for(int  i =0 ; i < s.length() ;i++){
            if(s.charAt(i) != goal.charAt(i)){
                count++;
                if(count > 2)   return false;
                s1[index] = s.charAt(i);
                s2[index] = goal.charAt(i);
                s1[index] = s.charAt(i);
                s2[index++] = goal.charAt(i);
            }
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        // for(int i =0 ; i < s1.length ; i++)     System.out.println(s1[i] +"    " + s2[i]);
        return Arrays.equals(s1 , s2);
    }
}