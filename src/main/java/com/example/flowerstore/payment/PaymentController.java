package com.example.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController 
{

    @GetMapping("/paypal")
    public String payWithPayPal(@RequestParam double price) 
    {
        PayPalPaymentStrategy paypalPaymentStrategy = new PayPalPaymentStrategy();
        return paypalPaymentStrategy.pay(price);
    }

    @GetMapping("/creditcard")
    public String payWithCreditCard(@RequestParam double price) 
    {
        CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        return creditCardPaymentStrategy.pay(price);
    }
}