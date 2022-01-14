package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit5Invitation {
    private String hostName;
    private String address;
    private String inviteName;

    public Unit5Invitation(String n, String a, String in) {
        hostName = n;
        address = a;
        inviteName = in;
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
    public String getInvite()
    {
        return "Dear " +inviteName +", please attend my event at " +address+". See you then, " +hostName+".";
    }

    public static void main(String[] args) {
        Unit5Invitation invite1 = new Unit5Invitation("sally", "1234 Random St", "sam");
    }
}
