// https://leetcode.com/problems/number-of-ways-to-divide-a-long-corridor/description/?envType=daily-question&envId=2025-12-14
class q35 {
    public int numberOfWays(String corridor) {
        final int mod = 1000000007;
        long zero = 0;
        long one = 0;
        long two = 1;
        
        for (char i : corridor.toCharArray()) {
            if (i == 'S') {
                zero = one;
                long temp = one;
                one = two;
                two = temp;
            } else {
                two = (two + zero) % mod;
            }
        }
        return (int) zero;
    }
}