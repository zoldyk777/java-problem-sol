// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
class prol1 {
    public static void main(String[] args) {
        int[] n={555,901,482,1771};
        System.out.println(findNumbers(n));
    }
    static int findNumbers(int[] nums) {
        int ne=0;
       
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int c=0;
            while(a>0){
                c++;
                a=a/10;

            }
            if(c%2==0){
                ne++;
                
            }
        }
        return ne;
    }
}