package com.example.sping_portfolio.controllers.adritaCollegeboardFRQs;

public class unit5part1 {
    String hostName;
    String address;
    String inviteName;
    public unit5part1(String hostName, String address, String inviteName){
        this.hostName = hostName;
        this.address = address;
        this.inviteName = inviteName;
    }
    public void invitation(String hostName, String address){
        this.address = address;
        this.hostName = "Host";
    }
    public String getHostName(){
        return hostName;
    }
    public String getAddress(String address){
        this.address = address;
        return address;
    }
    public String invite(){
        return "Dear " + inviteName + " you are invited to my event at  " + address + " See you then, " + hostName;
    }
    public static void main(String [] args){
        unit5part1 invite = new unit5part1("bob", "1111 Nighthawk Lane", "Adrita");
    }
}
