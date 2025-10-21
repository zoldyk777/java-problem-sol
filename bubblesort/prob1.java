import java.util.Arrays;

public class prob1 {
    public static void main(String[] args) {
        int [] arr={5,3,4,1,2};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    //descending
    static void bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]>arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    
}
