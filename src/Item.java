public class Item implements Comparable<Item>{

    private final Integer code;
    private final String name;
    private final int price;

    public Item(String name, int price, ItemStorage itemStorage) {
        this.name = name;
        this.price = price;
        code = itemStorage.getCounter();
    }

    @Override
    public int compareTo(Item o) {
        return this.code.compareTo(o.code);
    }

    public int getCode() {
        return code;
    }

    public String toString(){
        return "code = " + code + "; name = " + name + "; price = " + price;
    }
}
