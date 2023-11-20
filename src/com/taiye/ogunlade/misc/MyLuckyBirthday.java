package com.taiye.ogunlade.misc;

public class MyLuckyBirthday {
    public static void main(String[] args) {

        var speedingResult = caughtSpeeding(70, false);
        var result = speedResultInString(speedingResult);
        System.out.println(result);

    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int speedResult = -1;
        if (speed == 60 | speed <= 60) {
             speedResult = 0;
        }
        if (speed == 61 | speed <= 80) {
             speedResult = 1;
        }
        if (speed > 81) {
             speedResult = 2;
        }
        if (isBirthday && speed >= 0) {
            speedResult = 5;
        }
        return speedResult;
    }

    public static  String speedResultInString(int result) {
        String resultMessage;
        switch (result) {
            case 0:
                resultMessage = "No Ticket";
                break;
            case 1:
                resultMessage = "Small Ticket";
                break;
            case 2:
                resultMessage = "Big Ticket";
                break;
            default:
                resultMessage = "No Valid Input";
        }
        return resultMessage;
    }
}
