import java.util.HashMap;
import java.util.Map;

public class Store {
    private static Map<Item, Integer> store = new HashMap();

    public static void addItem(Item item, int count) {
        if (store.containsKey(item)) {
            store.put(item, store.get(item).intValue() + count);
        } else {
            System.out.println("Нет такого наименования");
        }
    }

    public static void addNewItemCategory(Item item) {
        if (!store.containsKey(item)) {
            store.put(item, 0);
        } else {
            System.out.println("Такой товар уже есть");
        }
    }

}
