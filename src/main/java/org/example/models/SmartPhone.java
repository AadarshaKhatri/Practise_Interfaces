package org.example.models;

public class SmartPhone extends Phone implements Internet,Camera{
    public void take_snap(){
        System.out.println("Taking the pictures");
    }
    public void record_videos(){
        System.out.println("Recording the videos");
    }
    public void connectNetwork(String network){
        System.out.println("You are conencting to" + network);
    }
     public String[] getNetworks(){
        System.out.println("Here are the network lists:");
        String[] networks = { " A", "B","C","D"};
        return networks;
    }


}
