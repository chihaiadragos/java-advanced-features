package DesignPatternsAndGoodPractices.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList = new ArrayList<>();
    public void addItem(Item item) {
        itemList.add(item);
    }
    public void removeItem(Item item) {
        itemList.remove(item);
    }
    public int calculateTotal() {
        int total = 0;
        for (Item item : itemList) {
            total += item.getPrice();
        }
        return total;
    }
    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(calculateTotal());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ShoppingCart{");
        sb.append("itemList=").append(itemList);
        sb.append('}');
        return sb.toString();
    }
}
