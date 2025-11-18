// Maximum Subarray Sum: Given an array, find the contiguous subarray with the largest sum
class q6{
    public static void main(String[] args) {
        int[] array1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = maxsubarr(array1);
        System.out.println("Array 1: " + java.util.Arrays.toString(array1));
        System.out.println("Max Subarray Sum (Array 1): " + result1);
    }

    public static  int maxsubarr(int [] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int currentmax=nums[0];
        int globalmax=nums[0];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            currentmax=Math.max(num, currentmax+num);
            globalmax=Math.max(globalmax,currentmax);
        }
        return globalmax;
    }
}