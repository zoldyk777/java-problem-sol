// https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/description/?envType=daily-question&envId=2025-12-14
class q36 {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder,(a,b)->a.length()-b.length());
        List<String> ans=new ArrayList<>();
        HashSet<String> hs=new HashSet<>();
        for(String s:folder){
                boolean add=true;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)=='/'&&hs.contains(s.substring(0,i))){add=false;break;}
                }
                if(add){ans.add(s);hs.add(s);}
        }
        return ans;
    }
}