// https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

public class ssleetcode1 {
    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        ss(arr);
        System.out.println(Arrays.toString(arr));
        
    }
        
    public static void ss(int[] arr){
        for(int i=0; i<arr.length;i++){
            int last=arr.length-i-1;
            int max=getmax(arr,0,last);
            swap(arr, max, last);
        }



    }
    public static int getmax(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }

        }
        return max;
    }
    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
    
}
