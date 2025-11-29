// https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/?envType=daily-question&envId=2025-11-29
class q19 {
    public int minOperations(int[] nums, int k) {
        long sum = 0;
        for (int x : nums) {
            sum += x;
        }
        return (int)(sum % k);

        
    }
}