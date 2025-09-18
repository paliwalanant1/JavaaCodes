package com.practicefifteen;

public class MainPayment {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment();
        ccp.pay();

        UPIPayment upi = new UPIPayment();
        upi.pay();
    }
}
