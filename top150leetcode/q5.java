// https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150
class q5 {
    public int jump(int[] nums) {
        int maxreach=0;
        int jump=0;
        int currentend=0;
        
        for(int i=0;i<nums.length-1;i++){
            maxreach=Math.max(maxreach,i+nums[i]);
            if(i==currentend){
                jump++;
                currentend=maxreach;
            }
        }
        return jump;
        
    }
}