package com.example.flowerstore.delivery;

import com.example.flowerstore.flowers.Item;

import java.util.LinkedList;

public interface Delivery 
{
    String deliver(LinkedList<Item> items);
}
