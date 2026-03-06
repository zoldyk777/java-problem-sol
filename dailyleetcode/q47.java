// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/?envType=daily-question&envId=2026-03-06
class q47 {
    public boolean checkOnesSegment(String s) {
        
        int idx=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){                
                if(i-idx>1){
                    return false;
                }
                idx=i;
            }
        }

        return true;

    }
}