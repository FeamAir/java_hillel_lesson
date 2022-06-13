package com.hillel.korolhomework13;

import java.util.Arrays;

public class Tehnology {
    public static void main(String[] args) {

        Androids androids = new Androids();

        String androidsCall = androids.call();
        String androidsSms = androids.sms();
        String androidsInternet = androids.internet();
        String[] listAndroids= {androidsCall,androidsSms,androidsInternet};
        System.out.println(Arrays.toString(listAndroids));

        IPhones iPhones = new IPhones();

        String iPhonesCall = iPhones.call();
        String iPhonesSms = iPhones.sms();
        String iPhonesInternet = iPhones.internet();
        String[] listIPhones= {iPhonesCall,iPhonesSms,iPhonesInternet};
        System.out.println(Arrays.toString(listIPhones));

        androids.touchID();
        iPhones.faceId();
    }
}
