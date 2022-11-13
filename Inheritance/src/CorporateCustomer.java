public class CorporateCustomer extends Customer {
    private String companyName;
    private int taxNumber;

    public CorporateCustomer() {

    }

    public CorporateCustomer(int id, String customerNumber, String companyName, int taxNumber) {
        super(id, customerNumber);
        this.companyName = companyName;
        this.taxNumber = taxNumber;
    }
}
