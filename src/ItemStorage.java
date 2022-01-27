import java.util.TreeSet;

public class ItemStorage {

    private final TreeSet<Item> storage = new TreeSet<>();

    public int counter = 0;


    public void addItem(String name, int price) {
        storage.add(new Item(name, price, this));
        counter++;
    }

    public Item getItem(int code) {
        for (Item item : storage) {
            if (item.getCode() == code) return item;
        }
        return null;
    }

    public int getCounter() {
        return counter;
    }
}
