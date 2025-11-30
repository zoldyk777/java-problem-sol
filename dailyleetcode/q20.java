// https://leetcode.com/problems/make-sum-divisible-by-p/description/?envType=daily-question&envId=2025-11-30
class q20 {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int x : nums) total += x;

        int rem = (int)(total % p);
        if (rem == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        long prefix = 0;
        int ans = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            int mod = (int)(prefix % p);

            int want = (mod - rem + p) % p;

            if (map.containsKey(want)) {
                ans = Math.min(ans, i - map.get(want));
            }

            map.put(mod, i);
        }

        return ans == nums.length ? -1 : ans;
        
    }
}