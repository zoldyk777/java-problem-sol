public class q1 {
    public static void main(String[] args) {
        // ton(5);
        // System.out.println(sum(6));
        // System.out.println(digi(1234));
        revv(12345);
        System.out.println(sum);

        
    }
    // print no from n to 1 using recursion
    static void num(int n){
        if(n==0) return ;
        System.out.println(n);
        num(n-1);
    }
    // print to 1 to n using recursion
    static void ton(int n){
        if(n==0) return;
        ton(n-1);
        System.out.println(n);
    }
    //return sum of n numbers 
    static int sum(int n){
        if(n<=1) return 1;

        return n+sum(n-1);
    }
    // return sum of digit using recursion
    static int digi(int n){
        if(n==0) return 0;
        int rem=n%10;
        int re=n/10;
        return rem+digi(re);
    }
    // return prduct
    static int product(int n){
        if(n%10==n)return n;

        return n%10*product(n/10);
    }
    // reverse num by rec
    static String rev(int n){
        if(n % 10 == n) return Integer.toString(n);
        int rem = n % 10;
        int re = n / 10;
        return rem + rev(re);
    }
    static int sum=0;
    static void revv(int n){
        if(n==0){
            return;
        }
        int rem = n % 10;
        sum=sum*10+rem;
        rev(n/10);
    }
    
}
