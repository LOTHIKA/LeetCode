class Solution {
    public boolean isPalindrome(String str, int s, int e) {
        while (s <= e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public void solve(String s, List<String> list, List<List<String>> result, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                list.add(s.substring(start, i + 1));
                solve(s, list, result, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> list = new ArrayList<>();
        solve(s, list, result, 0);
        return result;
    }
}