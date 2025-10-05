// https://leetcode.com/problems/split-array-largest-sum/description/
public class prob4 {
    public static void main(String[] agrs){
        int[] arr={7,2,5,10,8};
        int k=2;
        System.out.println(splitArray(arr, k));

    }
    static int splitArray(int[] nums, int k) {
        int s=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            s=Math.max(s,nums[i]);
            end=end+nums[i];
        }
        while(s<end){
            int mid=s+(end-s)/2;
            int sum=0;
            int p=1;
            for(int num:nums){
                if(sum+num>mid){
                    sum=num;
                    p++;
                }
                else{
                    sum=sum+num;

                }


            }
            if(p>k){
                s=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }
    
}
