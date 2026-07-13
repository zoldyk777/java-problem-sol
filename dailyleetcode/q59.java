// https://leetcode.com/problems/sequential-digits/description/?envType=daily-question&envId=2026-07-13
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> an=new ArrayList<>();
        for(int len=2;len<=9;len++){
            for(int start=1;start<=10-len;start++){
                int num=0;
                int digit=start;
                for(int i=0;i<len;i++){
                    num=num*10+digit;
                    digit++;
                }
                if(num>=low && num<=high){
                    an.add(num);
                }
            }
        } 
        return an;
        
    }
}