package com.example.flowerstore;

import com.example.flowerstore.delivery.DHLDelivery;
import com.example.flowerstore.delivery.PostDeliveryStrategy;
import com.example.flowerstore.flowers.*;
import com.example.flowerstore.payment.CreditCardPaymentStrategy;
import com.example.flowerstore.payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FlowerstoreApplicationTests {


    @Test
    public void testCalculateTotalPrice() {
        Flower rose = new Flower( 1.0, FlowerColor.RED, 50, FlowerType.ROSE);
        Flower tulip = new Flower(0.5, FlowerColor.GREEN, 35, FlowerType.TULIP);


        Order order = new Order();
        order.addItem(rose);
        order.addItem(tulip);

        double totalPrice = order.calculateTotalPrice();

        assertEquals(85.0, totalPrice);
    }

    @Test
    public void testDelivery(){
        Flower rose = new Flower( 1.0, FlowerColor.RED, 50, FlowerType.ROSE);
        Flower tulip = new Flower(0.5, FlowerColor.GREEN, 35, FlowerType.TULIP);

        DHLDelivery DHLdeliver = new DHLDelivery();
        PostDeliveryStrategy PostDeliver = new PostDeliveryStrategy();

        LinkedList<Item> items = new LinkedList<>();
        items.add(rose);
        items.add(tulip);

        String result = DHLdeliver.deliver(items);
        assertTrue(result.contains("DHL"));

        result = PostDeliver.deliver(items);
        assertTrue(result.contains("Post"));
    }

    @Test
    public void testPayment(){
        Flower rose = new Flower( 1.0, FlowerColor.RED, 50, FlowerType.ROSE);
        Flower tulip = new Flower(0.5, FlowerColor.GREEN, 35, FlowerType.TULIP);

        PayPalPaymentStrategy payPalPaymentStrategy = new PayPalPaymentStrategy();
        CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();

        Order order = new Order();
        order.addItem(rose);
        order.addItem(tulip);

        String result = payPalPaymentStrategy.pay(order.calculateTotalPrice());
        assertTrue(result.contains("PayPal"));

        result = creditCardPaymentStrategy.pay(order.calculateTotalPrice());
        assertTrue(result.contains("Credit"));
    }
}
