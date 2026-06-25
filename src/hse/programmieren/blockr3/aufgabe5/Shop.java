package hse.programmieren.blockr3.aufgabe5;

import java.util.List;

public interface Shop {

    void sell(Item item);

    List<Item> listInventory();
}
