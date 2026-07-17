// https://leetcode.com/problems/move-zeroes/description/
class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                k++;
            }

        }
        
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[l]=nums[j];
                l++;
            }
        }
        for(int a=0;a<k;a++){
            nums[l]=0;
            l++;
        }
        System.out.print(nums);
        
    }
}