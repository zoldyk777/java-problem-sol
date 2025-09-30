public class prob3 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int tar=4;
        System.out.println(search(arr, tar));
        
    }
    static int search(int[] nums, int target) {
        int s=0;
        int end=nums.length-1;
        int max=findpeak(nums);
        int f=ts(nums,target,s,max);
        if(f!=-1){
            return ts(nums,target,s,max);
        }
        else{
            return ts(nums,target,max+1,end);

        }

        
    }

    public static int ts(int[] arr,int target,int s,int end){

        while(s<=end){
            int mid= s+(end-s)/2;

            if(arr[mid]<target){
                s=mid+1;

            }
            else if(arr[mid]>target){
                end=mid -1;
            } else{
               return mid;
            }

        }
        return -1;

    }
    public static int findpeak(int[] arr){
        int s=0;
        int end=arr.length-1;
        while(arr[0]>arr[end]){
            end=end-1;

        }
        return end;

    }
    
}
