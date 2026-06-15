import java.util.*;

public class ShopInventory {
    public static void main(String []args){
        HashMap<String,Integer> stock = new HashMap<>();

        stock.put("Apple",50);
        stock.put("Banana",30);
        stock.put("Mango",20);
        stock.put("Orange",40);

        System.out.println(stock.size());
        System.out.println(stock.containsKey("Mango"));
        System.out.println(stock.containsKey("Grapes"));
        System.out.println(stock.containsValue(30));
        System.out.println(stock.get("Apple"));
        System.out.println(stock.getOrDefault("Grapes",0));
        stock.remove("Banana");

        for(Map.Entry<String,Integer> entry : stock.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for(String key : stock.keySet()){
            System.out.println(key);
        }
        for(int value : stock.values()){
            System.out.println(value);
        }



    }
}
