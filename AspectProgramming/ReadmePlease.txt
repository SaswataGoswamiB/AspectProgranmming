Introduction :


When ever we do our Busssiness Logic implemantation we do include everything like 
authentication Logging etc which is not even a bussiness Logic.Its a common Coding standard.
So we can exclude them from the bussiness Logic implementation and make them as an 
aspect and use them.This will enable us to seperate the Bussniess Logic from the non-bussiness Logic.


Aspect :

Anything thing that is not a bussiness Logic is called an Aspect.
Example Logging in a payment gateway is not a part of the Bussiness Logic.So it is an Aspect called
Logging Aspect.

Now how to replicate this in a code??????

So lets say that you have a makePayment() metthod and before  that you want to do some 
authentication.

So your authentication is an aspect.

So you create an authentication class. your class is your  Aspect.

Inside the class you will add some Logic or m,ethods for
 authenticartio.The logic/method thhat you are adding is your Advice.
 
 
 Now your makePayment() method before which  you want to call your authentication is your JoinPoint,
 So makePayment() is tyhe JoinPoint.
