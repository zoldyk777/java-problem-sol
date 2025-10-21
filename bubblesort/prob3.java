public class prob3 {
    public static void main(String[] args) {
        int[] arr={17,2,5,3,9};
        System.out.println(bubblesort(arr, 3));
        
    }
    //find the k-th smallest element using  bubble sort
    static int bubblesort(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr[k];
    }
    
}
