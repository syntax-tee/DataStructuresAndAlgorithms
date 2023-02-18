package com.taiye.ogunlade.basics.other.masterclass.arrays;

import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {
        int[] numberArray = new int[]{1, 2,3, 4, 5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(Arrays.toString(removeEven(numberArray)));
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 10;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;
        intArray[5] = 60;
        intArray[6] = 90;

        retrieveWithoutIndex(intArray);
        retrieveWithIndex(intArray,3);
    }


    static int retrieveWithoutIndex(int [] intArray){
        int index = -1;
        for(int i =0; i < intArray.length;i++){
            if(intArray[i] == 60){
                index = i;
                break;
            }
        }
        System.out.println("Array Item Retrieval without index = "+ index);
        return index;
    }

    static int retrieveWithIndex(int[] intArray,int index){
        for(int i =0; i < intArray.length;i++){
            if(intArray[i] == index){
                index = intArray[i];
                break;
            }
        }
        System.out.println("Retrieve with Index = "+ index);
        return index;
    }
    public static int[] showEvenNumber(int[] arr) {
        int evenElements = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) evenElements++;
        }

        //Create result array with the size equal to the number of odd elements in arr
        int[] result = new int[evenElements];
        int result_index = 0;

        //Put odd values from arr to the resulted array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                result[result_index++] = arr[i];
        } //end of for loop

        return result;
    } //end of showEven

    public static int[] removeEven(int[] arr) {
        int oddElements = 0;

        //Find number of odd elements in arr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) oddElements++;
        }

        //Create result array with the size equal to the number of odd elements in arr
        int[] result = new int[oddElements];
        int result_index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                result[result_index++] = arr[i];
        }
        return result;
    }
}
