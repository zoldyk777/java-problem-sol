// https://leetcode.com/problems/set-mismatch/
public class Q5 {
    public int[] findErrorNums(int[] nums) {
        
        cy(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    void cy(int[] arr){
        int i=0;
        while(i<arr.length){
            int c=arr[i]-1;
            if(arr[i]!=arr[c]){
                swap(arr,i,c);
            }
            else{
                i++;

            }
           
        }
    }
    void swap(int[]arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    
}
