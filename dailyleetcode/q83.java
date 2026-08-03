// https://leetcode.com/problems/stone-game-iii/description/?envType=daily-question&envId=2026-08-03
class q83 {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 1];
        
        for (int i = n - 1; i >= 0; i--) {
            int best = Integer.MIN_VALUE;
            int runningSum = 0;
            for (int k = 1; k <= 3; k++) {
                if (i + k > n) break;
                runningSum += stoneValue[i + k - 1];
                best = Math.max(best, runningSum - dp[i + k]);
            }
            dp[i] = best;
        }
        
        if (dp[0] > 0) return "Alice";
        else if (dp[0] < 0) return "Bob";
        else return "Tie";
    }
}