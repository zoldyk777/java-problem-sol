// https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/description/?envType=daily-question&envId=2026-07-30
class q79 {
    public int minimumPushes(String A) {
        int q = A.length() >> 3;
        int r = A.length() & 7;
        return ((q << 2) + r) * (q + 1);
    }
}