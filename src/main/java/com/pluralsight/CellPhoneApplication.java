package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setSerialNumber(0);
        cellPhone1.setPhoneModel("iphone 11");
        cellPhone1.setCarrier("T-Mobile");
        cellPhone1.setPhoneNumber("936-224-3473");
        cellPhone1.setOwnerName("Vanesa");

        CellPhone cellPhone = new CellPhone(111, "iPhone 12", "Metro", "936-224-8277", "Ruby");
        CellPhone cellPhone2 = new CellPhone("iphone10", 121, "AT&T", "936-221-2311", "Carolina");



        String phoneNum = "9362248277";
        cellPhone1.dial(phoneNum);
        System.out.println(cellPhone1.getDial());

        cellPhone1.dial(cellPhone.getPhoneNumber());
        cellPhone.dial(cellPhone1.getPhoneNumber());
        cellPhone1.dial(cellPhone2.getPhoneNumber());

        System.out.println("\nPhone 1");
        display(cellPhone1);

        System.out.println("\nPhone 2");
        display(cellPhone);

        System.out.println("\nPhone 3");
        display(cellPhone2);

    }

    public static void display(CellPhone phone) {

        System.out.println("---------------------------------\n" +
                "Serial Number: " + phone.getSerialNumber());
        System.out.println("Phone Model: " + phone.getPhoneModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwnerName());


    }


}
