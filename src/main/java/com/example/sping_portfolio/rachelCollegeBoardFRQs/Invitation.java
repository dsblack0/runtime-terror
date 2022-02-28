package com.example.sping_portfolio.rachelCollegeBoardFRQs;

public class Invitation {

    private String hostName;
    private String address;
    private String guestName;

    public Invitation(String n, String a, String g) {
        hostName = n;
        address = a;
        guestName = g;
    }

    public String returnHost() {
        System.out.println(hostName);
        return hostName;
    }

    public String returnGuest() {
        System.out.println(guestName);
        return guestName;
    }

    public String updateAddress(String newAddress) {
        address = newAddress;
        System.out.println(newAddress);
        return address;
    }

    public String invited(){
        System.out.println("Dear " + guestName + ", please attend my event at " + address + ". See you then, " + hostName +".");
        //return guestName + address + hostName;
        return "Dear " + guestName + ", please attend my event at " + address + ". See you then, " + hostName +".";
    }

    /*
    public String invited(String guest) {
        String invite = "Dear " + guest + ", please attend my event at " + address + ". See you then, " + hostName + ".";
        return invite;
    }
     */

    public static void main(String[] args) {
        //Invitation invite = new Invitation("person", "12345 street name");
        //System.out.println(invite.invited("friend"));
        Invitation invite = new Invitation("me", "there", "you");
        invite.invited();
        invite.returnHost();
        invite.returnGuest();


    }


}