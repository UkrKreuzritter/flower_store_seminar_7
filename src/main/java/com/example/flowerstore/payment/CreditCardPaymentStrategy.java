package com.example.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;

public class CreditCardPaymentStrategy implements Payment
{
    @GetMapping("/api/payment/creditcard")
    public String pay(double price)
    {
        return "Credit card? Time to pay " + price +" hrn";
    }
}
