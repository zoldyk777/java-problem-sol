public interface q5 {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(b(arr, 8, 0, arr.length-1));
        
    }
    //rotated binary search
    static int b(int[] arr,int tar,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==tar){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(tar>=arr[s] && tar<=arr[m]){
                return b(arr, tar, s, m-1);
            }
            else{
                return b(arr, tar, m+1, e);
            }
        }
        if(tar>=arr[m] && tar<=arr[e]){
            return b(arr, tar, m+1, e);
        }
        return b(arr, tar, s, m-1);

         
    }
}
