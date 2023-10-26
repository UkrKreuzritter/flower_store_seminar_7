package com.example.flowerstore.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Flower extends Item
{
    @Getter@Id
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() 
    {
        return color.toString();
    }

    public Flower(Flower flower)
    {
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;
    }
    public Flower(int price, double spella, FlowerColor flowerColor)
    {
        this.price = price;
        this.sepalLength = spella;
        this.color = flowerColor;
    }
}
