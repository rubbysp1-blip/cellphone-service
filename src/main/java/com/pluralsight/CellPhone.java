package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String phoneModel;
    private String carrier;
    private String phoneNumber;
    private String ownerName;
    private String dial;

    public CellPhone(){
        this.serialNumber = 0;
        this.phoneModel = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.ownerName = "";
        this.dial = "";
    }

    public CellPhone(int serialNumber, String phoneModel, String carrier, String phoneNumber, String ownerName){
        this.serialNumber = serialNumber;
        this.phoneModel = phoneModel;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;

    }

    public CellPhone(String phoneModel, int serialNumber, String carrier, String phoneNumber, String ownerName){
        this.serialNumber = serialNumber;
        this.phoneModel = phoneModel;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;

    }

    public void dial(String phoneNumber){
        this.dial = "Owner's phone is calling " + phoneNumber;
    }

    public void dial(CellPhone phone){
        this.dial = phone.phoneNumber;
    }

    public String getDial(){
        return this.dial;
    }

    public int getSerialNumber(){
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getPhoneModel(){
        return this.phoneModel;
    }

    public void setPhoneModel(String phoneModel){
        this.phoneModel = phoneModel;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
