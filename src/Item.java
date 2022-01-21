public class Item {

    private String code;
    private String name;
    private int price;
    private String definition;

    private Item() {
    }

    public static Item createItem(String name, int price) {
        Item item = new Item();
        item.name = name;
        item.price = price;
        return item;
    }

    public static Item createItem(String name, int price, String definition) {
        Item item = createItem(name, price);
        item.definition = definition;
        return item;
    }



}
