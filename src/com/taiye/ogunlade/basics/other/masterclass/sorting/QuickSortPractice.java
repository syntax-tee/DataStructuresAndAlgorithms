package com.taiye.ogunlade.basics.other.masterclass.sorting;

public class QuickSortPractice {

    public static void main(String[] args) {
        int[] nums = {1,5,4,7,6,9,8,3,2};
        QuickSortPractice practice = new QuickSortPractice(nums);
        practice.sort();
        practice.showArray();
    }

    private int[] nums;

    public QuickSortPractice(int[] nums) {
        this.nums = nums;
    }

    public void sort(){
        quickSort(0,nums.length-1);
    }

    public void showArray() {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    void quickSort(int low,int high){
        if(low>= high) return;
        int pivot=partition(low, high);
        quickSort(low,pivot-1);
        quickSort(pivot+1,high);

    }

    private int partition(int low, int high) {
        int pivotIndex = (low + high) / 2;
        swap(pivotIndex, high);
        int i = low;

        for (int j = low; j < high; j++) {
            if (nums[j] <= nums[high]) {
                swap(i, j);
                i++;
            }
        }
        swap(i, high);
        return i;
    }


    public void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
