// Given a list of integers, perform the following operations for each number:

// If the number is odd → ADD it to the result list.

// If the number is even →

// Compute the product of its digits.

// If the product is a perfect square → REMOVE it (do NOT add to result list).

// Otherwise → ADD the number to the result list.

// Return the final list after processing all numbers.
import java.util.*;

class q4{
    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(16, 3, 10, 25, 14);
        List<Integer> result=check(arr);
        System.out.println(result);
        
    }
    public static List<Integer> check(List<Integer> arr){
        List<Integer> re=new ArrayList<>();
        for(int n: arr){
            if(n%2!=0){
                re.add(n);
            }
            else{
                int product=1;
                int temp=n;
                while(temp>0){
                    product*=(temp%10);
                    temp/=10;
                }
                int sq=(int)Math.sqrt(product);  
                if(sq*sq!=product){
                    re.add(n);
                }         
             }
        }
        return re;

    }
}