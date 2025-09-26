public class builder {
    public static void main(String[] args) {
        StringBuilder b=new StringBuilder();
        String h="";
        for(int i=0;i<26;i++){
            char j=(char)('a'+i);
            // b.append(j);
            h=h+j;
        }
        System.out.println(h);
        // System.out.println(b.lastIndexOf(h));
        // System.out.println(b.indexOf(h));
    }
    
}
