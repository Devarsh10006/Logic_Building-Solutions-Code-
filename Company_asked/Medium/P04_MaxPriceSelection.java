import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Item {
    int price;
    String category;

    Item(int price, String category) {
        this.price = price;
        this.category = category;
    }
}

public class P04_MaxPriceSelection {
    public static int maxPrice(List<Item> items, int n, int k) {
        // Sort items descending by price
        Collections.sort(items, (a, b) -> b.price - a.price);

        Map<String, Integer> catCount = new HashMap<>();
        int totalPrice = 0;
        int chosen = 0;

        for (Item item : items) {
            if (chosen >= n) break;
            int count = catCount.getOrDefault(item.category, 0);
            if (count < k) {
                totalPrice += item.price;
                catCount.put(item.category, count + 1);
                chosen++;
            }
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(500, "Electronics"));
        items.add(new Item(400, "Electronics"));
        items.add(new Item(300, "Electronics"));
        items.add(new Item(200, "Sports"));
        items.add(new Item(150, "Beauty"));
        items.add(new Item(100, "Beauty"));

        int max = maxPrice(items, 4, 2);
        System.out.println("Maximum Price = " + max);
    }
}
