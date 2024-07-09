import exceptions.*;
import java.util.ArrayList;

public class Order {
    private String orderID;
    private String userID;
    private ArrayList<MenuItem> orderItems;
    private String status;
    private double totalPrice;

    public Order(String orderID, String userID) {
        this.orderID = orderID;
        this.userID = userID;
        this.orderItems = new ArrayList<>();
        this.status = "Pending";
        this.totalPrice = 0.0;
    }

    public void addOrderItem(MenuItem item) {
        orderItems.add(item);
        updateTotalPrice();
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void deleteOrderItem(MenuItem item) throws MenuItemNotFoundException {
        if (!orderItems.remove(item)) {
            throw new MenuItemNotFoundException("MenuItem not found in order");
        }
        updateTotalPrice();
    }

    public void deleteOrder(Order order) throws OrderNotFoundException {
        // Implementation to delete order
        throw new OrderNotFoundException("Order not found");
    }

    private void updateTotalPrice() {
        totalPrice = 0;
        for (MenuItem item : orderItems) {
            totalPrice += item.getPrice();
        }
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public ArrayList<MenuItem> getOrderItems() {
        return orderItems;
    }

    public String getStatus() {
        return status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
