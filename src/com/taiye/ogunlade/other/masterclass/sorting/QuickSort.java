package com.taiye.ogunlade.other.masterclass.sorting;

public class QuickSort {


    private int[] nums;

    public QuickSort(int[] nums) {
        this.nums = nums;
    }

    public void sort() {
        quickSort(0, nums.length - 1);
    }

    public void showArray() {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


    public void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
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

    private void quickSort(int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = partition(low, high);
        quickSort(low, pivot - 1);
        quickSort(pivot + 1, high);
    }
}
