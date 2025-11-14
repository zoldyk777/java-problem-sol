// Remove characters that appear more than once

// Input: "programming"
class q2{
    public static void main(String[] args) {
        String s="programming";
        System.out.println(remo(s));
        
    }
    public static String remo(String s){
        int[] free =new int[256];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           free[ch]++;
        }
        String d="";
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(free[c]==1){
                d+=c;
            }
        }
        return d;


    }
}