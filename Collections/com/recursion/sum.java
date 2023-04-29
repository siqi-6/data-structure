package com.recursion;

public class sum {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,4,5,6};
        System.out.println(getSum(nums, 0));
    }
    public static int getSum(int[] arr ,int l){

        if(l== arr.length){
            return 0;
        }
        // 会调用自己的子函数
        return arr[l]+getSum(arr,l+1) ;
    }
}
