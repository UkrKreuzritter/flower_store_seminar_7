package com.example.flowerstore;

import com.example.flowerstore.delivery.Delivery;
import com.example.flowerstore.flowers.Item;
import com.example.flowerstore.payment.Payment;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

public class Order {
    public LinkedList<Item> items = new LinkedList<>();
    @Getter@Setter
    private Payment PaymentStrategy;
    @Getter@Setter
    private Delivery DeliveryStrategy;

    public double calculateTotalPrice()
    {
        double sum = 0;
        for (Item item : items)
            sum += item.getPrice();
        return sum;
    }

    public void addItem(Item item)
    {
        this.items.add(item);
    }
    public void removeItem(Item item)
    {
        for (int i = 0; i < items.size(); i++)
            if (this.items.get(i) == item)
                this.items.remove(i);
    }

    public void  processOrder()
    {
        PaymentStrategy.pay(calculateTotalPrice());
        DeliveryStrategy.deliver(items);
    }
}
