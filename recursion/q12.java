public class q12 {
    public static void main(String[] args) {
        // skip("","bacacadae");
        // System.out.println(skipp("baaabcdcda"));
        // System.out.println(skippapple("bapplebcdcda"));
        System.out.println(skipappNotapple("bappbcdaapple"));
        System.out.println(skipappNotapple("bappbcdaappi"));
        

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
    // return type string
    static String skipp(String up){
        if(up.isEmpty()){
            
            return "";
        }

        char ch=up.charAt(0);
        if(ch=='a'){
            return skipp(up.substring(1));
        }
        else{
            return ch + skipp( up.substring(1));
        }
    }
    // skip apple in string 
    static String skippapple(String up){
        if(up.isEmpty()){
            
            return "";
        }

        
        if(up.startsWith("apple")){
            return skippapple(up.substring(5));
        }
        else{
            return up.charAt(0) + skippapple( up.substring(1));
        }
    }
    // skip app but not apple in string
    static String skipappNotapple(String up){
        if(up.isEmpty()){
            
            return "";
        }

        
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skippapple(up.substring(3));
        }
        else{
            return up.charAt(0) + skippapple( up.substring(1));
        }
    }
    
}
