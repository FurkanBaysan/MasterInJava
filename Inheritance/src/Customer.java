public class Customer {
    private int id;
    private String customerNumber;

    public Customer() {

    }

    public Customer(int id, String customerNumber) {
        this.id = id;
        this.customerNumber = customerNumber;
    }

    public int getId() {
        return this.id;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}
