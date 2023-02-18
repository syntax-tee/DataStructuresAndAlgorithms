package com.taiye.ogunlade.basics.arrays.solutions;

public class ReverseArray {

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6};
        ReverseArray reverseArray = new ReverseArray();
        int[] reversedArray = reverseArray.reverseArray(nums);
        for (int i = 0; i <reversedArray.length;i++){
            System.out.print(reversedArray[i]+" ");
        }
    }

    private void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
       nums[index2] = temp;
    }

    public int[] reverseArray(int[] nums){
       int  startIndex = 0; //first item
       int endIndex = nums.length-1; //last item

        while (endIndex>startIndex){
            swap(nums,startIndex,endIndex);
            startIndex++;
            endIndex--;
        }
        return nums;
    }
}
