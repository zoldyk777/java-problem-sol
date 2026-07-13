// https://leetcode.com/problems/array-partition/
class Solution {
    public int arrayPairSum(int[] nums) {
        int OFFSET = 10000; // to handle negative values
        int[] freq = new int[20001]; // range: -10000 to 10000 → 20001 possible values

        // Step 1: Build frequency array with offset
        for (int num : nums) {
            freq[num + OFFSET]++;
        }

        // Step 2: Walk through freq array in order, simulating sorted sequence
        int sum = 0;
        int position = 0; // tracks whether current emitted value is 1st or 2nd in its pair

        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                if (position % 2 == 0) {
                    // this is the smaller element of the pair → add it
                    sum += (i - OFFSET);
                }
                position++;
                freq[i]--;
            }
        }

        return sum;
    }
}