
import java.util.ArrayList;
import java.util.List;

// Question: If even → subtract product of digits, if odd → add sum of digits
class q8{
    public static void main(String[] args) {
        List<Integer> arr=List.of(12, 7, 8, 15);
        List<Integer> result= checkOE(arr);
        System.out.println(result);
        
    }
    public static List<Integer> checkOE(List<Integer> arr){
        List<Integer> re=new ArrayList<>();
        for(int n:arr){
            if(n%2==0){
                int pr=1;
                int temp=n;
                while(temp>0){
                    pr=pr*temp%10;
                    temp/=10;

                }
                re.add(n-pr);
            }
            else{
                int sum=0;
                int temp=n;
                while(temp>0){
                    sum+=temp%10;
                    temp/=10;
                }
                re.add(n+sum);

            }
            
        }
        return re;

    }
}