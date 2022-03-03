package taskFive.bean;

import taskFive.bean.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
    public static List<Item> createItemDatabase() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("apple",2, 100));
        items.add(new Item("penny", 1, 50));
        items.add(new Item("silver", 1, 200));
        items.add(new Item("gold", 5, 2000));
        items.add(new Item("dollar", 1, 20));
        return items;
    }
}
