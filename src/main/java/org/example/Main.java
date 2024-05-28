package org.example;


import org.example.models.Phone;
import org.example.models.SmartPhone;

public class Main {
    public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone();
        String[] listofNetworks = iphone.getNetworks();
        for(String item: listofNetworks){
            System.out.println(item);
        }
        iphone.connectNetwork("B");
        iphone.record_videos();
        iphone.take_snap();


        Phone nokia = new Phone();
        nokia.pickCall();
        nokia.Call(981899147);

    }

}