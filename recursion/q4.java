import java.util.ArrayList;

public class q4 {
    public static void main(String[] args) {
        int[] arr={1,4,7,8,44,9,9,6};
        System.out.println(lss(arr, 44, 0));
        System.out.println(ls(arr, 7, 0));
        System.out.println(findfromlast(arr, 7, arr.length-1));
        // findallindex(arr, 9, 0);
        // System.out.println(list);
        System.out.println(findindex(arr,9,0,new ArrayList<>()));
         
    }
    static boolean ls(int[] arr, int tar,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==tar|| ls(arr,tar,index+1);
    }
    static int lss(int[] arr, int tar,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==tar){
            return index;
        }
        else{
            return lss(arr,tar,index+1);
        }
    
    }
    static int findfromlast(int[] arr, int tar,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==tar){
            return index;
        }
        else{
            return lss(arr,tar,index-1);
        }
    
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void findallindex(int[] arr, int tar,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==tar){
            list.add(index);
        }
        findallindex(arr, tar, index+1);
    
    }
    static ArrayList<Integer> findindex(int[] arr, int tar,int index,ArrayList<Integer> listt){
        if(index==arr.length){
            return listt;
        }
        if(arr[index]==tar){
            listt.add(index);
        }
        return findindex(arr, tar, index+1,listt);
    
    }
     
    
}
