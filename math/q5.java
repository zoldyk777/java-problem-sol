// Question: Remove or Add Based on Digit Sum Odd/Even

// Given a list of integers:

// If the digit sum of a number is even → ADD to result

// If the digit sum is odd → REMOVE (don’t add)

import java.util.ArrayList;
import java.util.List;

class q5{
    public static void main(String[] args) {
        List<Integer> arr=List.of(12, 34, 24, 44, 56);
        List<Integer> result=check(arr);
        System.out.println(result);
        
    }
    public static List<Integer> check(List<Integer> arr){
        List<Integer> re =new ArrayList<>();
        for(int n: arr){
            int sum=0;
            int temp=n;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            if(sum%2==0){
                re.add(n);
            }
        }
        return re;

    }
}