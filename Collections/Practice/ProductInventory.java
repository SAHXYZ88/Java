import java.util.*;
public class ProductInventory {
    public static void main(String[] args){
        ArrayList<String> products = new ArrayList<>();
        products.add("Apple");
        products.add("Banana");
        products.add("Mango");
        products.add("Orange");

        System.out.println(products.size());
        System.out.println("Contains  Apple : " + products.contains("Apple"));
        System.out.println("Contains  Grapes : " + products.contains("Grapes"));
        products.remove(1);
        products.remove("Mango");
        for(String product : products){
            System.out.println(product);
        }

        System.out.println(products.size());




    }

}
