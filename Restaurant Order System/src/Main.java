import exceptions.*;

public class Main {
    public static void main(String[] args) throws OrderNotFoundException {
        try {
            // Create some menu items
            MenuItem item1 = new MenuItem("1", "Burger", 5.99, "Available");
            MenuItem item2 = new MenuItem("2", "Fries", 2.99, "Available");
            MenuItem item3 = new MenuItem("3", "Coke", 1.99, "Available");

            // Create a menu and add items to it
            Menu menu = new Menu();
            menu.addItem(item1);
            menu.addItem(item2);
            menu.addItem(item3);

            // Create an order
            Order order = new Order("order1", "user1");
            order.addOrderItem(item1);
            order.addOrderItem(item2);

            // Create admin and waiter
            Admin admin = new Admin("staff1", "Alice", "1234567890", "admin1");
            Waiter waiter = new Waiter("staff2", "Bob", "0987654321", "waiter1");

            // Waiter takes an order
            waiter.takeOrder(order);

            // Admin updates menu item
            admin.updateItem(item1, "Cheeseburger", 6.99, "Available");

            // Admin deletes an order item
            admin.deleteOrderItem(order, item2);

            // Display order details
            System.out.println("Order ID: " + order.getOrderID());
            System.out.println("User ID: " + order.getUserID());
            System.out.println("Order Status: " + order.getStatus());
            System.out.println("Total Price: $" + order.getTotalPrice());

        } catch (MenuItemNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InvalidOperationException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
