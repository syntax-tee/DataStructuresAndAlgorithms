package com.taiye.ogunlade.basics.arrays.solutions;


import java.util.Arrays;

public class RemoveEvenIntegersFromAnArray {


    //Time complexity 0(n)

    public static int[] removeEven(int[] arr) {
        int oddElements = 0;

        //Find number of odd elements in arr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) oddElements++;
        }

        //Create result array with the size equal to the number of odd elements in arr
        int[] result = new int[oddElements];
        int result_index = 0;

        //Put odd values from arr to the resulted array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                result[result_index++] = arr[i];
        } //end of for loop

        return result;
    } //end of removeEven


    public static void main(String args[]) {
        int[] arr = {1,2,3,4};

        System.out.println("Before removing Even Numbers: ");
        System.out.println(Arrays.toString(arr) +  " ");
        int[] newArr =  removeEven(arr); // calling removeEven

        System.out.println("After removing Even Numbers: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] +  " "); // prinitng array
        }
    }

}
