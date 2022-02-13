import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        Map itemStorage = ItemStorage.getInstance();

        List<Item> itemList = new ArrayList(Arrays.asList(
                new Item("Чайник", 3000),
                new Item("Крутой_чайник", 4000),
                new Item("Микроволновка", 3500),
                new Item("Микроволновка_2", 3100),
                new Item("Батарейки", 200)
        ));


        ItemStorage.addItems(itemList);

        System.out.println(itemList);

        System.out.println("\n\n" + ItemStorage.getItem(2));
    }

}
