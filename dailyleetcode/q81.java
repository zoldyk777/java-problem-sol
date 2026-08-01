// https://leetcode.com/problems/predict-the-winner/description/?envType=daily-question&envId=2026-08-01
class q81 {
    public boolean predictTheWinner(int[] A) {
        int n = A.length;
        if ((n & 1) == 0) return true;

        int[] dp = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = A[i];
            for (int j = i + 1; j < n; j++)
                dp[j] = Math.max(A[i] - dp[j], A[j] - dp[j - 1]);
        }

        return dp[n - 1] >= 0;
    }
}