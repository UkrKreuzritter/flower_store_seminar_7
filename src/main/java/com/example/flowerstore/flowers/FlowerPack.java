package com.example.flowerstore.flowers;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class FlowerPack extends Item{
    private Flower flower;
    private int quantity;
    public double getPrice(){
        return quantity * getFlower().getPrice();
    }

    public void setQuantity(int q)
    {
        this.quantity = Math.max(0, q);
    }

    public  FlowerPack(Flower flower, int quantity)
    {
        this.flower = flower;
        this.quantity = quantity;
    }

}