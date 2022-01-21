import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class Main {


    public static void main(String[] args) {

        ItemStorage itemStorage = ItemStorage.getInstance(Item.createItem("Чайник", 3000));
        itemStorage.addItem(Item.createItem("Крутой_чайник", 4000));
        itemStorage.addItem(Item.createItem("Микроволновка", 3500));
        itemStorage.addItem(Item.createItem("Микроволновка_2", 3100));
        itemStorage.addItem(Item.createItem("Батарейки", 200));

        System.out.println(itemStorage);
    }

}
