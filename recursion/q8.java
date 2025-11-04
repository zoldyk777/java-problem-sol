import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        int [] arr={2,3,4,1,5,8,7};
        ss(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
        
    }
    // recursion selection sort
    static void ss(int[] arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                ss(arr, r, c+1, c);
            }
            else{
                ss(arr, r, c+1, max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            ss(arr, r-1, 0, 0);
        }
    }
    
}
