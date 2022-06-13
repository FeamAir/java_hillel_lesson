package com.hillel.korolhomework13;

public class Androids implements Smartphones, LinuxOS{
    @Override
    public String call() {
        return "Call Androids";
    }

    @Override
    public String sms() {
        return "Sms Androids";
    }

    @Override
    public String internet() {
        return "Internet Androids";
    }

    @Override
    public void touchID() {
        System.out.println("touchID");
    }
}
