package hse.programmieren.blockr3.aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class CarShop implements Shop {

    private List<Item> items = new ArrayList<>();

    @Override
    public void sell(final Item item) {
        items.remove(item);
        System.out.println("removed item: " + item);
    }

    @Override
    public List<Item> listInventory() {
        System.out.println("available items: " + items);
        return items;

    }

}
