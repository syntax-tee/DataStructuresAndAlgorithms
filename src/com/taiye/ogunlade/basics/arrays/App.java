package com.taiye.ogunlade.basics.arrays;

public class App {

    public static void main(String[] args) {
       int[] nums = new int[5];

        for(int i =0; i<nums.length;i++){
            nums[i] = i;
        }

        //O(1) - random Access
        int num = nums[2];
        System.out.println("Access "+num);

        //0(N) "Linear Search"
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 0){
                System.out.println("Index found at "+ i);
            }
        }

    }
}
