package com.taiye.ogunlade.logic;

public class MonkeyTrouble {
    public static void main(String[] args) {
        var result = monkeyTroubleOptimised(false,false);
        System.out.println(result);
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
        if(aSmile && bSmile && !aSmile && !bSmile){
            return false;
        }
        return true;
    }

    public static boolean monkeyTroubleOptimised(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
        // The above can be shortened to:
        //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
        // Or this very short version (think about how this is the same as the above)
        //   return (aSmile == bSmile);
    }


}
