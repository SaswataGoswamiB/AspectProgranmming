package org.example.Demo;

import org.example.Demo.service.PaymentService;
import org.example.Demo.service.PaymentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainex {

    public static void main(String[] args) {

        ApplicationContext applicationContext=
        		new ClassPathXmlApplicationContext("Config.xml");
        
      PaymentService paymentService= 
    		  applicationContext.getBean("pay",PaymentService.class);
        
        paymentService.makepayment(500000,"Saswata");

    }
}
