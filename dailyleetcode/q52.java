// https://leetcode.com/problems/jump-game-ix/description/?envType=daily-question&envId=2026-05-07
class q52 {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        if (n == 0) return new int[0];

        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }

        int[] res = new int[n];
        int prefixMax = Integer.MIN_VALUE;
        int chunkStart = 0;

        for (int i = 0; i < n; i++) {
            prefixMax = Math.max(prefixMax, nums[i]);

            // If we hit a chunk boundary
            if (i == n - 1 || prefixMax <= suffixMin[i + 1]) {
                for (int j = chunkStart; j <= i; j++) {
                    res[j] = prefixMax;
                }
                chunkStart = i + 1;
                prefixMax = Integer.MIN_VALUE;
            }
        }
        return res;
    }
}