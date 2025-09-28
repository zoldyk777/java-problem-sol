//https://leetcode.com/problems/richest-customer-wealth/description/
public class prol2 {
    public static void main(String[] agrs){
        int[][] n={
            {1,2,3},
            {3,2,1}
        };
        System.out.println(max(n));
    }
    static int max(int[][] accounts){
         int ans=0;
        for(int i=0;i<accounts.length;i++){
            int s=0;
            for(int j=0;j<accounts[i].length;j++){
                s=s+accounts[i][j];
            }
            if(s>ans){
                ans=s;
            }
        }
        return ans;
    }
    
}
