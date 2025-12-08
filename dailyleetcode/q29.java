// https://leetcode.com/problems/count-square-sum-triples/description/?envType=daily-question&envId=2025-12-08
class q29 {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sumsq=i*i+j*j;
                int c=(int) Math.sqrt(sumsq);
                if(c*c==sumsq && c<=n){
                    count+=2;
                }
            }
        }
        return count;
        
    }
}