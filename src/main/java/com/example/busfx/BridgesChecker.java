package com.example.busfx;

public class BridgesChecker {
    public static boolean check(int[] massiv){
        for (int i = 0; i < massiv.length; i++) {
            if(massiv[i] <= 437)
                return false;
        }
        return true;
    }

    public static int findCrash(int[] massiv){
        for (int i = 0; i < massiv.length; i++) {
            if(massiv[i] <= 437)
                return i+1;
        }
        return -1;
    }
}
