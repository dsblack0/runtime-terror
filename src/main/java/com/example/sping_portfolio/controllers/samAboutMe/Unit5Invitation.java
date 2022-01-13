package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit5Invitation {
    private String hostName;
    private String address;

    public Unit5Invitation(String n, String a) {
        hostName = n;
        address = a;
    }
    public void Invitation(String host, String address) {
        this.address = address;
        this.hostName = "Host";
    }
    public String getHostName() {

        return hostName;
    }
    public String setAddress(String ad) {
        address = ad;
        return address;
    }
    public String invite(String name)
    {
        String message = "Dear " +name +", please attend my event at " +address+". See you then, " +hostName+".";
        return message;
    }

    public static void main(String[] args) {
        Unit5Invitation invite1 = new Unit5Invitation("sally", "17024 Silver Pine Rd");
        System.out.println(invite1.invite("sam"));
    }
}
