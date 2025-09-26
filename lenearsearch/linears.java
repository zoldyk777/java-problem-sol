class linears{
    public static void main(String[] args) {
        int[][] arr={{12,22,33},
                {2,3,34},
                {23,35,36,45,99,37}

        };
        System.out.println(max(arr));
//        int[] arr={23,45,667,43,3,33};
//        int target=43;
//        System.out.println(ls(arr,target,1,5));

    }
    public static int[] search(int[][] arr,int target){
        for(int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int max (int[][] arr){
        int m= Integer.MIN_VALUE; // or int m=arr[0][0];
        for(int row=0;row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){

                if(m<arr[row][col]){
                    m=arr[row][col];

                }
            }

        }
        return m;
    }
    public static int ls(int[] arr,int target,int s,int e){
        if(arr.length==0){
            return -1;
        }
        for(int i=s;i<e;i++){
            int ele=arr[i];
            if(ele==target){
                return i;
            }
        }
        return -1;
    }
}