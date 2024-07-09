public class MenuItem {
    private String itemID;
    private String itemName;
    private double price;
    private String availability;

    public MenuItem(String itemID, String itemName, double price, String availability) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        this.availability = availability;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void updateAvailability(String newAvailability) {
        this.availability = newAvailability;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
