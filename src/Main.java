public class Main {


    public static void main(String[] args) {

        ItemStorage itemStorage = new ItemStorage();
        itemStorage.addItem("Чайник", 3000);
        itemStorage.addItem("Крутой_чайник", 4000);
        itemStorage.addItem("Микроволновка", 3500);
        itemStorage.addItem("Микроволновка_2", 3100);
        itemStorage.addItem("Батарейки", 200);

        System.out.println(itemStorage);

        System.out.println("\n\n" + itemStorage.getItem(2));
    }

}
