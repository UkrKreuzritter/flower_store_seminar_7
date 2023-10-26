package com.example.flowerstore.flowers;

import java.util.ArrayList;
import java.util.List;

import com.example.flowerstore.filter.SearchFilter;

public class  Store 
{
    private List<Item> items = new ArrayList<>();
    public List<Item>  search(SearchFilter filter)
    {
        List<Item> found_items = new ArrayList<>();
        for (Item item:items)
            if (filter.match(item))
                found_items.add(item);
        return found_items;
    }

    public void add_item(Item item)
    {
        this.items.add(item);
    }

    public int get_item_size()
    {
        return  this.items.size();
    }
}
