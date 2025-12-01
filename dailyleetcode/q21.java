// https://leetcode.com/problems/maximum-running-time-of-n-computers/description/?envType=daily-question&envId=2025-12-01
class q21 {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int b : batteries) sum += b;

        long low = 0, high = sum / n;

        while (low < high) {
            long mid = high - (high - low) / 2; // upper mid

            if (canRun(mid, n, batteries)) {
                low = mid; // mid possible
            } else {
                high = mid - 1; // mid not possible
            }
        }

        return low;
    }

    private boolean canRun(long T, int n, int[] batteries) {
        long power = 0;

        for (int b : batteries) {
            power += Math.min(b, T);
        }

        return power >= (long)n * T;
    }
}