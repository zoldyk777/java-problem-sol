// https://leetcode.com/problems/number-of-substrings-with-only-1s/description/?envType=daily-question&envId=2025-11-16
class q4 {
    public int numSub(String s) {
        long mod=1000000007;
        int n=s.length();
        long count=0;
        long ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            else{
                ans=(ans+(count*(count+1))/2)%mod;
                count=0;

            }
        }
        ans=(ans+(count*(count+1))/2)%mod;

        return (int)ans;
        

        
    }
}