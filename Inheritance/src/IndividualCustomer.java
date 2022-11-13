import java.time.LocalDate;

public class IndividualCustomer extends Customer {
    private String nationalIdentity;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public IndividualCustomer() {

    }

    public IndividualCustomer(int id, String customerNumber, String nationalIdentity, String firstName, String lastName, LocalDate birthDate) {
        super(id, customerNumber);
        //setId(id);
        //setCustomerNumber(customerNumber);
        this.nationalIdentity = nationalIdentity;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}
