public class Q2 {
    public static void main(String[] args) {
        int[] ar={2,1,3,7,5,6,4};
        insertion(ar);
        System.out.println("number of shifts:"+count);
        
    }
    //count the no> of shifts
    public static int count=0;
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    count++;

                } 
                else{
                    break;
                }
               
            }

        }

    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    
    
}
