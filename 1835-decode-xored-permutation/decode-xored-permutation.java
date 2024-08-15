class Solution {
    public int[] decode(int[] encoded) {
        int temp = 0;
        int n = encoded.length+1;
        for(int i=1;i<=n;i++){
            temp = temp^i; 
        }
        for(int i=1;i<n-1;i+=2) {
           temp = temp ^ encoded[i];
        }
        int[] result = new int[n];
        result[0] = temp;
        for(int i=0;i<n-1;i++){
            result[i+1] = result[i] ^ encoded[i];
        }
        return result;
    }
}