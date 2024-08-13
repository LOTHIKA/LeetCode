class Solution {
      public long maxAlternatingSum(int[] nums) {
        long n = 0, m = 0;
        for (int x : nums) {
            long odd = Math.max(m - x, n);
            long even = Math.max(n + x, m);
            n = odd;
            m = even;
        }
        return Math.max(n, m);
    }
}