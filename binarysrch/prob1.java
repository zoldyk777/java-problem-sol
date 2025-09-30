// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class prob1 {
    public static void main(String[] args) {
        int[] arr={0,2,1,0};
        System.out.println(peakelefind(arr));
        
    }
    static int peakelefind(int[] arr){
        int s=0;
        int end=arr.length-1;
        while(s<end){
            int mid=s+(end-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else{
                end=mid;
            }
        } 
        
        return s;
    }
    
}
