public class q12 {
    public static void main(String[] args) {
         skip("","bacacadae");
        

    }
    // skip all the a in string using recursion
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p + ch, up.substring(1));
        }
    }
    
}
