package com.example.sping_portfolio.kaavyaCollegeBoardFRQs;

public class InvitationFRQ5 {
    private String hostName;
    private String address;

    public InvitationFRQ5 (String n, String a) {
        hostName = n;
        address = a;
    }

    public InvitationFRQ5 (String address) {
        this.address = address;
        hostName = "Host";
    }

    public String returnHost () {
        return hostName;
    }

    public String updateAddress (String a) {
        address = a;
        return address;
    }

    public String invite (String attendee) {
        String message = "Dear " + attendee + ", please attend my event at " + address + ". See you there, " + hostName + ".";
        return message;
    }
}
