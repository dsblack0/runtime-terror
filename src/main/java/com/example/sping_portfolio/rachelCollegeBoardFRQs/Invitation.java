package com.example.sping_portfolio.rachelCollegeBoardFRQs;

public class Invitation {

    private String hostName;
    private String address;
    private String newAddress;

    public Invitation(String n, String a) {
        hostName = n;
        address = a;
    }

    public String returnHost() {
        System.out.println(hostName);
        return hostName;
    }

    public static String updateAddress(String newAddress) {
        System.out.println(newAddress);
        return newAddress;
    }

    public String invited(String guest) {
        String invite = "Dear " + guest + ", please attend my event at " + address + ". See you then, " + hostName + ".";
        return invite;
    }

    public static void main(String[] args) {
        Invitation invite = new Invitation("person", "12345 street name");
        System.out.println(invite.invited("friend"));
    }


}
