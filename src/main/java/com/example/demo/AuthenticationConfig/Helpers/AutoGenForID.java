package com.example.demo.AuthenticationConfig.Helpers;

import java.util.concurrent.atomic.AtomicInteger;

public class AutoGenForID {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(100);

    public static String userID(String userFN, String userLN){
        String fn = userFN.substring(0, Math.min(userFN.length(), 3));
        String ln = userLN.substring(0, Math.min(userLN.length(), 3));
        return ID_GENERATOR.getAndIncrement()+fn+ln;
    }

    public static void main(String[] args) {
        System.out.println(userID("ARtiom", "Oriol"));
    }

}
