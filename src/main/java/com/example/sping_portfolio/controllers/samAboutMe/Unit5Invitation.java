package com.example.sping_portfolio.controllers.samAboutMe;

public class Unit5Invitation {
    private String hostName;
    private String address;
    private String inviteName;

    public Unit5Invitation() {
        this.hostName = "Host";
        this.address = "1234 road";
        this.inviteName = "Human";
    }
    public void Invitation(String host, String address) {
        this.address = address;
        this.hostName = "Host";
    }
    public String getHostName() {

        return hostName;
    }
    public void setInvite(String hn, String ad, String in) {
        address = ad;
        inviteName = in;
        hostName = hn;
    }
    public String getInvite()
    {
        return "Dear " +inviteName +", please attend my event at " +address+". See you then, " +hostName+".";
    }

    public static void main(String[] args) {
        Unit5Invitation invite1 = new Unit5Invitation();
        invite1.setInvite("sally", "1234 Random St", "sam");
        System.out.println(invite1.getInvite());
    }
}
