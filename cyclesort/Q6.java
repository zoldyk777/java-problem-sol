// https://leetcode.com/problems/first-missing-positive/
public class Q6 {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int c=nums[i]-1;
           if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[c]) {
                swap(nums,i,c);
            } 
            else{i++;}
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;
        
        
    }
    void swap(int[]arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    
}
