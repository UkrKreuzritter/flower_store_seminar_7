package com.example.flowerstore;

import com.example.flowerstore.flowers.Flower;
import com.example.flowerstore.flowers.FlowerColor;
import com.example.flowerstore.flowers.FlowerType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController 
{
    @GetMapping("/processing")
    public void processOrder() {
        Flower rose = new Flower( 1.0, FlowerColor.RED, 3241, FlowerType.ROSE);
        Flower tulip = new Flower(0.5, FlowerColor.GREEN, 324, FlowerType.CHAMOMILE);


        Order order = new Order();
        order.addItem(rose);
        order.addItem(tulip);
        order.processOrder();
    }
    @GetMapping("/state")
    public String ok(){
        return "oki doki!!!";
    }

}
