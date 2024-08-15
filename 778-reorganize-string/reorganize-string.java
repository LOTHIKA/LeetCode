class Solution {
    public String reorganizeString(String s) {
       int arr[] = new int[26]; 
        int n = s.length(); 
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++; 
        }
        
        char ans[] = new char[n];
        int max = Integer.MIN_VALUE;
        int letter = -1; 
        
        for (int i = 0; i < 26; i++) {
            if (max < arr[i]) {
                max = arr[i];
                letter = i;
            }  
        }
        if (arr[letter] > (n + 1) / 2) {
            return "";
        }
        int index = 0; 
        
        while (arr[letter]-- > 0) {
            ans[index] = (char)(letter + 'a'); 
            index += 2; 
        }
        
        
        for (int i = 0; i < 26; i++) {
            while (arr[i]--> 0) {
                if (index >= n) {
                    index = 1; // If 'ind' goes beyond the last index, reset it to 1 (odd index).
                }
                ans[index] = (char)(i + 'a'); // Place the character at index 'i'.
                index += 2; // Move to the next even index.
            }
        }
        
        // Step 5: Convert 'ans' array to a string and return the reorganized string.
        return String.valueOf(ans);
    }
}