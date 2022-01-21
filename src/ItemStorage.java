import java.util.SortedMap;
import java.util.SortedSet;

public class ItemStorage {

    private static ItemStorage ITEM_STORAGE = null;

    private static SortedSet<Item> storage = null;


    public static ItemStorage getInstance(Item item) throws IllegalStateException {
        if (storage.size() == 0) {
            synchronized (ItemStorage.class) {
                if (storage.size() == 0) {
                    ITEM_STORAGE = new ItemStorage();
                    ITEM_STORAGE.addItem(item);
                }
            }
        }
        return ITEM_STORAGE;
    }

    private ItemStorage() {

    }

    public void addItem(Item item) {
        storage.add(item);
    }
}
