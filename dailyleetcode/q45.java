public class q45 {
    public static void main(String[] args) {
        int[] num={1,1,2,2,2,3,3,4,4,5,5};
        int k=2;
        int j=0;
        for(int i=k;i<=num.length-k;i++){
            num[j]=num[i];
            j++;



            
        }
        while(j<num.length){
            num[j]=1;
            j++;
        }
        for(int i=1;i<=num.length;i++){
            System.out.print(num[i]+" ");
        }
        
    }
    
}
