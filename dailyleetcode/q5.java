// https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/description/?envType=daily-question&envId=2025-11-17
class q5 {
    public boolean kLengthApart(int[] nums, int k) {
        int last=-1000000;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                    if(i-last-1<k){
                        return false;
                    }
                last=i;
            }
        }
        return true;
        
    }
}