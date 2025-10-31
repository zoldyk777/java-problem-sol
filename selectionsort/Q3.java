public class Q3 {
    public static void main(String[] args) {
        int[] arr={5, 2, 8, 1, 3};
        ss(arr);
        System.out.println("smallest:"+ arr[0] );
        System.out.println("largest:"+ arr[arr.length-1] );
        
    }
    // Find both the smallest and largest elements

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
