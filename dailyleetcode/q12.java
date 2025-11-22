// https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/?envType=daily-question&envId=2025-11-22
class q12 {
    public int minimumOperations(int[] nums) {
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3!=0){
                count++;
            }

        }
        return count;
    }
}