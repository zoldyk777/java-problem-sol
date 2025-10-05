public class q1 {
    public static void main(String[] args) {
        ton(5);
        
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
    
}
