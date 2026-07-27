// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/?envType=daily-question&envId=2026-07-27
class q74 {
    public int maxProduct(int[] nums) {
        int max=0;
        int len=nums.length;
        int curr=nums[0];
        for(int i=1;i<len;i++){
            max=Math.max(max,(curr-1)*(nums[i]-1));
            curr=Math.max(curr,nums[i]);
        }
        return max;
        //simple solution..
        // Arrays.sort(nums);
        // int len=nums.length-1;
        // return (nums[len]-1)*(nums[len-1]-1);
        //..
        
    }
}