// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cy(nums);
        List<Integer> an=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                an.add(i+1);

            }
        }
        return an;
        
    }
    static void cy(int[] arr){
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
    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    
}
