// https://leetcode.com/problems/height-checker/description/
class Solution {
    public int heightChecker(int[] heights) {
        int[] exp=heights.clone();
        // for(int i=0;i<heights.length;i++){
        //     exp[i]=heights[i];
        // }
        Arrays.sort(exp);
        int k=0;
        for(int j=0;j<heights.length;j++){
            if(heights[j]!=exp[j]){
                k++;

            }
        }
        return k;
        
    }
}