// Next Greater Element: Given an array, print the element which is the next greater element to the right for each index

import java.util.Arrays;
import java.util.Stack;

class q8{
    public static void main(String[] args) {
        int[] array1 = {4, 5, 2, 25};
        int[] result1 =find(array1);
        System.out.println("Input: " + Arrays.toString(array1));
        System.out.println("NGE:   " + Arrays.toString(result1));
        
    }
    public static int[]find(int[]arr){
        int n=arr.length;
        if(n==0){
            return new int[0];


        }
        int[] result =new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int currentElement = arr[i];
            while (!stack.isEmpty() && stack.peek() <= currentElement) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
         stack.push(currentElement);
        }
        return result;

    }
}