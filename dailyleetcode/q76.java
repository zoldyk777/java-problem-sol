// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/?envType=daily-question&envId=2026-07-28
class q76 {
    public int minPartitions(String n) {
        char max=n.charAt(0);
        for(int i=1;i<n.length();i++){
            if(n.charAt(i)>max){
                max=n.charAt(i);
            }
        }
        return max -'0';
    }
}