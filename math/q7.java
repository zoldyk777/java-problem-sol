
import java.util.ArrayList;
import java.util.List;

// Question: For each number: if divisible by 3 → reverse its digits, else → ignore
class q7{
    public static void main(String[] args) {
        List<Integer> arr= List.of(12, 25, 30, 41);
        List<Integer> result=check(arr);
        System.out.println(result);
        
    }
    public static List<Integer> check(List<Integer> arr){
        List<Integer> re = new ArrayList<>();

        // int n=arr.get(i)
        for(int n: arr){
            int temp=n;
            int reverse=0;
            if(n%3==0){
                while(temp>0){
                    reverse=reverse*10+temp%10;
                    temp/=10;
                }
                re.add(reverse);

            }


        }
        return re;


    }

}