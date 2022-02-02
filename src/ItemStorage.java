import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ItemStorage {

    private final Map<Integer, Item> storage = new HashMap<>();

    public void addItem(String name, int price) {
        storage.put(storage.size(), new Item(name, price));
    }

    public void addItem(Item item) {
        storage.put(storage.size(), item);
    }

    public void addItems(@NotNull List<Item> itemList) {
        Map<Integer, Item> map = new HashMap<>();
        int temp = storage.size();
        for (int i = temp; i < temp + itemList.size(); i++) {
            addItem(itemList.get(i));
        }
        storage.putAll(map);
    }

    public Item getItem(int index) {
        return storage.get(index);
    }

    public HashMap<Integer, Item> getStorage(){
        return new HashMap<>(storage);
    }

    public void Print(){
        storage.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
