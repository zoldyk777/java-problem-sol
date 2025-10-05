// https://leetcode.com/problems/find-peak-element/description/
public class prob2 {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4};
        System.out.println(findpeak(arr));
        
    }
    static int findpeak(int[] arr){
         int s=0;
        int end=arr.length-1;
        while(s<end){
            int mid=s+(end-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else {
                end=mid;
            }
        }
        return s;
    }
    
}
