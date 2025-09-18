package com.practicefifteen;

public class CreditCardPayment extends Payment{
    @Override
    public void pay() {
        System.out.println("Payment done using CreditCard");
    }
}