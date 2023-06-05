package org.example.Demo.aspec;

import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {

	//Inside the aspect we will ad  out advice.
	//if makepayment() doesnot have any argument 
	//@Before("execution( * org.example.Demo.service.PaymentServiceImpl.makepayment())")
	
	//when makePayment()n is having an argeument.
	@Before("execution( * org.example.Demo.service.PaymentServiceImpl.makepayment(..))")
	
	//Here all the methods inside of PaymentServiceImpl will be Considered rather tha only makePayment() 
	//@Before("execution( *  org.example.Demo.service.PaymentServiceImpl.*)")
	
	// Here all the methods of makePayment() with all the return type  will be considered.
	//@Before("execution( * org.example.Demo.service.PaymentServiceImpl.makepayment())")
	
	//Here only the makePayment() method of return type void is considered.
	//@Before("execution( void org.example.Demo.service.PaymentServiceImpl.makepayment())")
	
	public void authenticatiom() 
	{
		//Logic for authentication.
		
		System.out.println("User has been authenticated.");
	}
	
	@After("execution( * org.example.Demo.service.PaymentServiceImpl.makepayment(..))")
	//@Before("execution( * org.example.Demo.service.PaymentServiceImpl.*)")
	public void Logoff() 
	{
		//Logic for authentication.
		
		System.out.println("User has Logged Off!!");
	}
}
