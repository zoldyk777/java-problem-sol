// https://leetcode.com/problems/maximum-ice-cream-bars/description/?envType=daily-question&envId=2026-06-21
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);

        int n = 0;

        for(int i = 0; i<costs.length; i++){
            if(coins<=0 || costs[i]>coins){
                break;
            }
            n++;
            coins-=costs[i];
        }

        return n;
    }
}