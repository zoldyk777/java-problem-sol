// https://leetcode.com/problems/find-the-duplicate-number/
public class Q3 {
    public int findDuplicate(int[] nums) {
        int mis=0;
        c(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                mis=nums[i]; 
            }
        }
        return mis;
        
    }
    static void c(int[] arr){
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
    static void swap(int[] arr, int e,int f){
            int temp=arr[e];
            arr[e]=arr[f];
            arr[f]=temp;
        }
    
}
