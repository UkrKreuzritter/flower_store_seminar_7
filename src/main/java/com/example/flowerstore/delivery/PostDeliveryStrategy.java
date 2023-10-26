package com.example.flowerstore.delivery;

import com.example.flowerstore.flowers.Item;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedList;

public class PostDeliveryStrategy implements Delivery
{
    @GetMapping("/api/delivery/Post")
    public  String deliver(LinkedList<Item> items)
    {
        return "Post??? Better prepare yourself for old age...";
    }
}
