// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
class q10  {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(nums[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}