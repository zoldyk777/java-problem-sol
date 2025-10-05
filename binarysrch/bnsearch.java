
class bnsearch {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5,6,56,66,78,99};
        int[] a={99,97,89,79,5,4,3,2,-23};
        int tar=-23;
        System.out.println(os(a,tar));
//        System.out.println(bs(arr,tar));
    }
    public static int os(int [] arr,int target){
        int s=0;
        int end=arr.length-1;
        boolean isac=arr[s]<arr[end];
        while(s<=end){
            int mid=s+(end-s)/2;
            if (arr[mid]==target){
                return mid;}
            if(isac){

                 if(arr[mid]<target){
                    s=mid +1;

                }
                else {
                    end=mid -1;
                }

            }
            else {

                 if(arr[mid]<target){
                    end=mid-1;

                }
                else {
                    s=mid+1;
                }

            }
        }
        return -1;
    }
    public static int bs(int[] arr, int target ){

        int start=0;// interger min value
        int end= arr.length -1;
        while(start<=end){
            int mid= start+(end-start)/2; //(start+end)/2; we do not use this cause if int calue exceeds to optimize we us this one

            if(arr[mid]<target){
                start=mid +1;

            }
            else if(arr[mid]>target){
                end=mid -1;
            } else{
                return mid;

            }

        }

       return -1;
    }
}