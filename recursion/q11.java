import java.util.Arrays;

public class q11 {
    public static void main(String[] args) {
        int [] arr={5,3,8,4,2,7,1,10};
        quickr(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    // quick sort it is preffere in array sorting as it is faster
    static void quickr(int[] arr,int low,int hi ){
        if(low>=hi){
            return;

        }
        int s=low;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot=arr[m];

        while(s<=e){

            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
       
    }
    
}
