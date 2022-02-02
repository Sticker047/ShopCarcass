import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        ItemStorage itemStorage = new ItemStorage();

        List<Item> itemList = new ArrayList(Arrays.asList(
                new Item("Чайник", 3000),
                new Item("Крутой_чайник", 4000),
                new Item("Микроволновка", 3500),
                new Item("Микроволновка_2", 3100),
                new Item("Батарейки", 200)
        ));


        itemStorage.addItems(itemList);

        itemStorage.Print();

        System.out.println("\n\n" + itemStorage.getItem(2));
    }

}
