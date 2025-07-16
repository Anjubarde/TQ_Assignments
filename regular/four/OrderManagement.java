package regular.four;
import java.util.*;

//3.Create Order class { orderid , customername , item[] }
//item class { itemid , itemname , price }
//each order can contain different number of items.
//a. show number of items in each order
//b. Sort order array based on number of items in descending order
//c. show orderid and totalprice of that order ( totalprice is sum of price of all items in that order )

class Item {
    int itemId;
    String itemName;
    double price;

    Item(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }
}

class Order {
    int orderId;
    String customerName;
    List<Item> items;

    Order(int orderId, String customerName, List<Item> items) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
    }

    // Method to calculate total price of order
    double getTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.price;
        }
        return total;
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        // Create items
        List<Item> items1 = Arrays.asList(
                new Item(1, "Laptop", 55000),
                new Item(2, "Mouse", 1200)
        );

        List<Item> items2 = Arrays.asList(
                new Item(3, "Keyboard", 2500)
        );

        List<Item> items3 = Arrays.asList(
                new Item(4, "Monitor", 15000),
                new Item(5, "Headset", 3500),
                new Item(6, "USB Cable", 500)
        );

        // Create orders with different number of items
        List<Order> orders = Arrays.asList(
                new Order(101, "Mayur", items1),
                new Order(102, "Anjali", items2),
                new Order(103, "Dipak", items3)
        );

        // a. Show number of items in each order
        System.out.println("a. Number of items in each order:");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.orderId + " has " + order.items.size() + " items.");
        }

        // b. Sort orders by number of items (descending)
        orders.sort((o1, o2) -> Integer.compare(o2.items.size(), o1.items.size()));
        System.out.println("\nb. Orders sorted by number of items (descending):");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.orderId + " - Items: " + order.items.size());
        }

        // c. Show order ID and total price
        System.out.println("\nc. Order ID and total price of each order:");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.orderId + " - Total Price: ₹" + order.getTotalPrice());
        }
    }
}
