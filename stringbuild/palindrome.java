public class palindrome {
    public static void main(String[] args) {
        String a="abba";
        String b="abbba";
        System.out.println(ispal(a));
        System.out.println(isp(b));
        

    }
    //for loop
    static boolean ispal(String st){
        if(st==null||st.length()==0)return true;
        st=st.toLowerCase();
        for(int i=0;i<st.length()/2;i++){
            if(st.charAt(i)!=st.charAt(st.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    //while loop
    static boolean  isp(String a){
        boolean s=true;
        int st=0;
        int end=a.length()-1;
        while(st<end){
            if(a.charAt(st)==a.charAt(end)){
            s=true;

        }
        else{
            s=false;
        }
        st++;
        end--;

        }
        return s;

    }
    
}
