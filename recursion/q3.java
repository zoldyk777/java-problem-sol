public class q3 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,7,6};
        System.out.println(so(a, 0));
        
    }
    //check arry soarted or not
    static boolean so(int[] arr,int i){
        if(i==arr.length-1) return true;
        return arr[i]<arr[i+1]&&so(arr,i+1);

    }
    
}
