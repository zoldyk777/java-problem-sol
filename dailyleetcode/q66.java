// https://leetcode.com/problems/container-with-most-water/description/
class q66 {
    public int maxArea(int[] height) {
        int s=0;
        int last=height.length-1;
        int max=0;
        while(s<last){
            int area=(last-s)*Math.min(height[s],height[last]);
            if(max<area){
                max=area;
            }
            if(height[s]<height[last]){
                s++;

            }
           else{
            last--;
           }
            


        }
        return max;
        
    }
}