// https://leetcode.com/problems/greatest-sum-divisible-by-three/description/?envType=daily-question&envId=2025-11-23
class q13 {
    public int maxSumDivThree(int[] nums) {
        int sum=0;
         int min1_1 = Integer.MAX_VALUE, min2_1 = Integer.MAX_VALUE; 
        int min1_2 = Integer.MAX_VALUE, min2_2 = Integer.MAX_VALUE; 

        for (int x : nums) {
            sum += x;

            if (x % 3 == 1) {
                if (x < min1_1) {
                    min2_1 = min1_1;
                    min1_1 = x;
                } else if (x < min2_1) {
                    min2_1 = x;
                }
            } 
            else if (x % 3 == 2) {
                if (x < min1_2) {
                    min2_2 = min1_2;
                    min1_2 = x;
                } else if (x < min2_2) {
                    min2_2 = x;
                }
            }
        }

        if (sum % 3 == 0) return sum;

        int r = sum % 3;
        int option1 = Integer.MAX_VALUE;
        int option2 = Integer.MAX_VALUE;

        if (r == 1) {
            option1 = min1_1;
            if (min1_2 != Integer.MAX_VALUE && min2_2 != Integer.MAX_VALUE)
                option2 = min1_2 + min2_2;
        } 
        else { 
            option1 = min1_2;
            if (min1_1 != Integer.MAX_VALUE && min2_1 != Integer.MAX_VALUE)
                option2 = min1_1 + min2_1;
        }

        int remove = Math.min(option1, option2);

        return sum - remove;
        
    }
}