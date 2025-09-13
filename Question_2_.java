package HomeWork3_TQ;
import java.util.*;
/*
	2.Flipkart maintains a list<order> from different places .Order has (orderid,city,itemname,status).
	From this create a Map which stores key has cityname and count as no of order’s  pending in that city. Data should be sorted according to city .
 */

public class Order 
{
    int orderId;
    String city;
    String itemName;
    String status;  // e.g., "pending", "completed", etc.

    // Constructor
    public Order(int orderId, String city, String itemName, String status)
    {
        this.orderId = orderId;
        this.city = city;
        this.itemName = itemName;
        this.status = status;
    }

    // Getters (optional for clarity)
    public String getCity() 
    { 
    	return city; 
    }
    public String getStatus() 
    { 
    	return status; 
    }
}


// Java Code to create sorted Map (city -> count of pending orders):

public class Question_2_
{
    public static void main(String[] args) 
    {
        List<Order> orders = Arrays.asList(
            new Order(101, "Delhi", "Mobile", "pending"),
            new Order(102, "Mumbai", "Laptop", "completed"),
            new Order(103, "Delhi", "Tablet", "pending"),
            new Order(104, "Bangalore", "Mobile", "pending"),
            new Order(105, "Mumbai", "Laptop", "pending"),
            new Order(106, "Bangalore", "Monitor", "completed"),
            new Order(107, "Delhi", "Keyboard", "completed")
        );

        // Step 1: Use TreeMap for sorted keys (city)
        Map<String, Integer> pendingOrdersCount = new TreeMap<>();

        // Step 2: Iterate orders and count pending orders by city
        for (Order order : orders) {
            if ("pending".equalsIgnoreCase(order.getStatus())) {
                pendingOrdersCount.put(order.getCity(),
                    pendingOrdersCount.getOrDefault(order.getCity(), 0) + 1);
            }
        }

        // Step 3: Print the result
        System.out.println("Pending orders by city (sorted):");
        for (Map.Entry<String, Integer> entry : pendingOrdersCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
