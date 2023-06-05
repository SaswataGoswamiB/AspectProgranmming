package org.example.Demo.service;

public class PaymentServiceImpl implements PaymentService{

    @Override
    public void makepayment(int a,String name) {
        // TODO Auto-generated method stub

        //payment code

        System.out.println("Amount debited !!!"+a);

        ///credit code

        System.out.println("Amount is credited to "+name+" bank account.");

    }

}
