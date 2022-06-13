package com.hillel.korolhomework13;

public class IPhones implements Smartphones,IOS{
    @Override
    public String call() {
        return "Call iPhones";
    }

    @Override
    public String sms() {
        return "Sms iPhones";
    }

    @Override
    public String internet() {
        return "Internet iPhones";
    }

    @Override
    public void faceId() {
        System.out.println("faceID");
    }
}
