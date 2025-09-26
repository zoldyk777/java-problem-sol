public class st {
    public static void main(String[] args) {
        String a="example";
        String b="example";
        //pointing at same(pool)
        System.out.println(a==b);
        // without pool outside( different)
        String name1= new String("ron");
        String name2= new String("ron");
        System.out.println(name1==name2);

        
    }
    
    
}
