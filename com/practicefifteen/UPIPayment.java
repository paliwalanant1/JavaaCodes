package com.practicefifteen;

public class UPIPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}