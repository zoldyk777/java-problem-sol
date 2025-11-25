// https://leetcode.com/problems/smallest-integer-divisible-by-k/submissions/1839512532/?envType=daily-question&envId=2025-11-25
class q15 {
    public int smallestRepunitDivByK(int k) {
        if(k==1) return 1;
        if(k%2==0 || k%5==0) return -1;

        int rem = 0;
        for(int i=1;i<=k;i++){
            rem = (rem*10+1)%k;
            if(rem==0) return i;
        }
        return -1;
        
    }
}