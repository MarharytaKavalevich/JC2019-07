package lesson09.hashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CatalogDemo {
    public static void main(String[] args) {

        Map<String, Integer> products = new HashMap<>();
        products.put("Electronics", 1000);
        products.put("Computers and networks", 2000);
        products.put("Appliances", 500);
        products.put("Construction and repair", 1500);
        products.put("House and garden", 700);
        products.put("Auto moto", 0);
        products.put("Beauty and sport", 600);
        products.put("Children and mothers", 0);
        products.put("Work and office", 900);

        System.out.println("Sorted collection by number of products in each category: ");
        products.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Сategory which contains the maximum number of products: ");
        System.out.println(Collections.max(products.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey());
        System.out.println();

        System.out.println("Collection with deleted categories in which there are no products: ");
        Iterator<Map.Entry<String, Integer>> it = products.entrySet().iterator();
        while(it.hasNext()) {
            if (it.next().getValue() == 0) {
                it.remove();
            }
        }
        products.entrySet().forEach(System.out::println);
    }
}
