// https://leetcode.com/problems/missing-number/
public class Q1 {
    public static void main(String[] agrs){
        int[] arr={3,0,1};
        int ans=missingNumber(arr);
        System.out.println(ans);

    }
    public static  int missingNumber(int[] nums) {
        cyclic(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
                
            }
        }
        return nums.length;
        
    }
    public static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    
}
