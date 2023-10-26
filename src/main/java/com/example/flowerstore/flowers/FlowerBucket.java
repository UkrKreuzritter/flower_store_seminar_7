package com.example.flowerstore.flowers;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter @Setter
public class FlowerBucket extends Item
{
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    
    private int quantity;

    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks)
            price += flowerPack.getPrice();
        return  price;
    }
}
