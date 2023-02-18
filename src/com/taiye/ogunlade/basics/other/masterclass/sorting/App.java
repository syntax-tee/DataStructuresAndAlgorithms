package com.taiye.ogunlade.basics.other.masterclass.sorting;

public class App {

    public static void main(String[] args) {
        int[] nums = {1,5,3,7,6,9,8,3,2};
        QuickSort quickSort = new QuickSort(nums);
        quickSort.sort();
        quickSort.showArray();
    }
}
