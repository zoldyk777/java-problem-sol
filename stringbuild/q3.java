// Convert characters: if digit → sum to total, if letter → reverse case
class q3{
    public static void main(String[] args) {
        String s = "aB3dE5";
        System.out.println(convertt(s));
        

    }
    public static String convertt(String s){
        String result="";
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                int digit=ch-'0';
                sum+=digit;
            }
            else if(ch>='a'&& ch<='z'){
                result+=(char)(ch-32);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            }
        }
        return result + "  (Digit Sum = " + sum + ")";

    }
}