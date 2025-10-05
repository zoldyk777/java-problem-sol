public class fibo {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,44,77};
        int tar=44;
        System.out.println(search(arr, tar, 0, arr.length -1));
        
    }
    //binary search using recursion
    static int search(int[]arr,int target,int s,int end){
        if(s>end){
            return -1;
        }
        int mid=s+(end-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr, target, s, mid-1);
        }
        else{
            return search(arr, target, mid+1, end);
        }
    }

    
}
