package com.taiye.ogunlade.other.masterclass.search;

public class LinearSearch {

    public static void main(String[] args) {
       int[] intArray ={20,36,43,23,-5,1,55,7};
        System.out.println("Linear Search "+linearSearch(intArray,43));
    }

    public static int linearSearch(int[] array,int value){
        for(int i =0; i <array.length;i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
