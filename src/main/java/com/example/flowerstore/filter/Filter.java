package com.example.flowerstore.filter;

import com.example.flowerstore.flowers.Item;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Filter implements SearchFilter 
{
    private double minPrice = 0;
    private double maxPrice = 321455;

    public boolean match(Item item) 
    {
        return item.getPrice()>=minPrice && item.getPrice()<=maxPrice;
    }
}