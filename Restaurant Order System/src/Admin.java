import exceptions.*;

public class Admin extends Staff {
    private String adminID;

    public Admin(String staffID, String staffName, String contactNo, String adminID) {
        super(staffID, staffName, contactNo);
        this.adminID = adminID;
    }

    public void deleteOrderItem(Order order, MenuItem item) throws MenuItemNotFoundException {
        order.deleteOrderItem(item);
    }

    public void deleteOrder(Order order) throws OrderNotFoundException {
        // In a real application, this would interact with an order database or collection
        throw new OrderNotFoundException("Order not found");
    }

    public void updateItem(MenuItem item, String newName, double newPrice, String newAvailability) {
        item.setItemName(newName);
        item.setPrice(newPrice);
        item.setAvailability(newAvailability);
    }

    public void deleteItem(Menu menu, MenuItem item) throws MenuItemNotFoundException {
        menu.deleteItem(item);
    }

    public void updatePrice(MenuItem item, double newPrice) {
        item.setPrice(newPrice);
    }

    public void updateAvailability(MenuItem item, String newAvailability) {
        item.setAvailability(newAvailability);
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }
}
