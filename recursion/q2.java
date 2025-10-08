public class q2 {
    static int count=0;
    static void noofzero(int n){
        if(n%10==n) return;
        int rem =n%10;
        if(rem==0){
            count++;

        }
        noofzero(n/10);
    }
     public static void main(String[] agrs){
        noofzero(307060);
        System.out.println(count);


    }
    
}
