import exceptions.*;

public class Waiter extends Staff {
    private String waiterID;

    public Waiter(String staffID, String staffName, String contactNo, String waiterID) {
        super(staffID, staffName, contactNo);
        this.waiterID = waiterID;
    }

    public void takeOrder(Order order) throws InvalidOperationException {
        if (order == null) {
            throw new InvalidOperationException("Order cannot be null");
        }
        // Additional implementation for taking order
    }

    public String getWaiterID() {
        return waiterID;
    }

    public void setWaiterID(String waiterID) {
        this.waiterID = waiterID;
    }
}
