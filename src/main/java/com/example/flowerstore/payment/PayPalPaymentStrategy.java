package com.example.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;

public class PayPalPaymentStrategy implements Payment
{
    @GetMapping("/api/payment/paypal")
    public String pay(double price){
        return "PayPal is awful. It banned my account! Pay " + price+ " hrn";
    }
}
