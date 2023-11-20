package com.taiye.ogunlade.logic;

public class SleepIn {
    public static void main(String[] args) {
        var answer = sleepInOptimised(true, true);
        System.out.println(answer);
    }

    /**
     * Sleep in if it is not weekday or we are on vacation
     *
     * @return true if we sleep in
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean result = false;
        if (!weekday && !vacation) return result = true;
        if (weekday && !vacation) return result = false;
        if (!weekday || vacation) return true;
        return result;
    }


    public static boolean sleepInOptimised(boolean weekday, boolean vacation) {
       if(!weekday || vacation){
           return true;
       }
       return false;
    }



}
