class Solution {
    public String reorganizeString(String s) {
       int arr[] = new int[26]; // 'ar' array is used to store character frequencies.
        int n = s.length(); // Length of the input string.
        int count = n; // Counter to keep track of the remaining characters.
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i); // Get the character at index 'i'.
            arr[ch - 'a']++; // Increment the count of the corresponding character.
        }
        
        // Step 2: Find the most frequent character and its count.
        char ans[] = new char[n]; // 'ans' array will store the reorganized string.
        int max = Integer.MIN_VALUE; // Variable to store the maximum character count.
        int letter = -1; // Variable to store the index of the most frequent character.
        
        for (int i = 0; i < 26; i++) {
            if (max < arr[i]) {
                max = arr[i];
                letter = i;
            }  
        }
        
        // Step 3: Check if it's possible to reorganize the string.
        // If the count of the most frequent character is greater than (n+1)/2,
        // it's not possible to reorganize such that the same characters are not adjacent.
        if (arr[letter] > (n + 1) / 2) {
            return "";
        }
        
        // Step 4: Reorganize the string.
        int index = 0; // Index to keep track of where to insert characters in 'ans'.
        
        while (arr[letter]-- > 0) {
            ans[index] = (char)(letter + 'a'); // Place the most frequent character.
            index += 2; // Move to the next even index.
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