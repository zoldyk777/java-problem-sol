// https://leetcode.com/problems/paths-in-matrix-whose-sum-is-divisible-by-k/submissions/1840369009/?envType=daily-question&envId=2025-11-26
class q16 {
    public int numberOfPaths(int[][] grid, int k) {
        
        int m = grid.length, n = grid[0].length;
        int MOD = 1_000_000_007;

        int[][][] dp = new int[m][n][k];

        dp[0][0][grid[0][0] % k] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];

                for (int r = 0; r < k; r++) {
                    int ways = dp[i][j][r];

                    if (ways == 0) continue;
                    if (i + 1 < m) {
                        int nr = (r + grid[i + 1][j]) % k;
                        dp[i + 1][j][nr] = (dp[i + 1][j][nr] + ways) % MOD;
                    }
                    if (j + 1 < n) {
                        int nr = (r + grid[i][j + 1]) % k;
                        dp[i][j + 1][nr] = (dp[i][j + 1][nr] + ways) % MOD;
                    }
                }
            }
        }

        return dp[m - 1][n - 1][0];
    }
}