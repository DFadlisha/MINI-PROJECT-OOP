public class Staff {
    protected String staffID;
    protected String staffName;
    protected String contactNo;

    public Staff(String staffID, String staffName, String contactNo) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.contactNo = contactNo;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getStaffID() {
        return staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getContactNo() {
        return contactNo;
    }
}
