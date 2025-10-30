import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr={5, 2, 8, 1, 3};
        ss(arr);
        System.out.println(Arrays.toString(arr));



        
    }
    // descinding order
    public static void ss(int[] arr){
        for(int i=0; i<arr.length;i++){
            int last=arr.length-i-1;
            int min=getmin(arr,0,last);
            swap(arr, min, last);
        }



    }
    public static int getmin(int[] arr, int s, int end) {
    int min = s;
    for (int i = s; i <= end; i++) {
        if (arr[min] > arr[i]) {
            min = i;
        }
    }
    return min;
}
    static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
    
}
