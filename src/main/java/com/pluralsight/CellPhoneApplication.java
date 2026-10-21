package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone phoneInfo = new CellPhone();
//        What is the serial number? 2597153
//        What model is the phone? iPhone 15 Pro Max
//        Who is the carrier? Verizon
//        What is the phone number? 888-555-1234
//        Who is the owner of the phone? Sandr
        phoneInfo.setSerialNumber(0);
        phoneInfo.setPhoneModel("iphone 12");
        phoneInfo.setCarrier("Metro");
        phoneInfo.setPhoneNumber("936-224-8277");
        phoneInfo.setOwnerName("Ruby");


        System.out.println(phoneInfo.getSerialNumber());
        System.out.println(phoneInfo.getPhoneModel());
        System.out.println(phoneInfo.getCarrier());
        System.out.println(phoneInfo.getPhoneNumber());
        System.out.println(phoneInfo.getOwnerName());
    }
}
