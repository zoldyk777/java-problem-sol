// https://leetcode.com/problems/binary-prefix-divisible-by-5/description/?envType=daily-question&envId=2025-11-24
class q14 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> re=new ArrayList<>();
        int val=0;
        for(int bit:nums){
            val=(val*2+bit)%5;
            re.add(val==0);
        }
        return re;
        
    }
}