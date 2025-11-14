// Question: For each number, if prime → double it, else → keep it same

// Given a list:

// If number is prime, add number * 2

// Else add number as it is

import java.util.ArrayList;
import java.util.List;

class q6{
    public static void main(String[] args) {
        List<Integer> arr=List.of(5, 10, 11, 12, 3);
        List<Integer> result=prime(arr);
        System.out.println(result);

        
    }
    public static List<Integer> prime(List<Integer> arr){
        List<Integer> re=new ArrayList<>();
       for (int i = 0; i < arr.size(); i++) {
            int n = arr.get(i);
            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j*j <= n; j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;    
                    }
                }
            }

            if (isPrime) {
                re.add(n * 2);  
            } else {
                re.add(n);
            }
        }

        return re;
    }
}