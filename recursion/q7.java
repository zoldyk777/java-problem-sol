import java.util.Arrays;

public class q7 {
    public static void main(String[] args){
        int [] arr={4,3,2,1};
        rbubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void rbubble(int[] arr, int l,int s){
        if(l==0){
            return;
        }
        if(s<l){
            if(arr[s]>arr[s+1]){
                int temp=arr[s];
                arr[s]=arr[s+1];
                arr[s+1]=temp;
            
            }
            rbubble(arr,l,s+1);
        }
        else{
            rbubble(arr,l-1,0);
        }

    }
    
}
