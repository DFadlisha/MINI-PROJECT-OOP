import exceptions.*;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public void updateItem(MenuItem item, String newName, double newPrice, String newAvailability) {
        item.setItemName(newName);
        item.setPrice(newPrice);
        item.setAvailability(newAvailability);
    }

    public void deleteItem(MenuItem item) throws MenuItemNotFoundException {
        if (!menuItems.remove(item)) {
            throw new MenuItemNotFoundException("MenuItem not found in menu");
        }
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
