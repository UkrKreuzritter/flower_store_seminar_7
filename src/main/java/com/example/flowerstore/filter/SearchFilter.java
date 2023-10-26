package com.example.flowerstore.filter;

import com.example.flowerstore.flowers.Item;

public interface SearchFilter 
{
    boolean match(Item item);
}