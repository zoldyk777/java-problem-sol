// https://leetcode.com/problems/unique-length-3-palindromic-subsequences/?envType=daily-question&envId=2025-11-21
class q11 {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int result = 0;
        for(char ch = 'a'; ch <= 'z'; ch++) {
            int left = -1, right = -1;
            for(int i = 0; i < n; i++) {
                if(s.charAt(i) == ch) {
                    if (left == -1) left = i;
                    right = i;
                }
            }
            if(left == -1 || right == left) continue;
            boolean[] seen = new boolean[26];

            for (int i = left + 1; i < right; i++) {
                seen[ s.charAt(i) - 'a' ] = true;
            }
            for (int i = 0; i < 26; i++) {
                if (seen[i]) result++;
            }
        }

        return result;
        
    }
}