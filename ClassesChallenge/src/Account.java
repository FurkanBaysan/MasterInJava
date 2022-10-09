public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


    public void deposit(double depositAmount) {
        this.balance = this.balance + depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New Balance: " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance < withdrawalAmount) {
            System.out.println("Insufficient Balance. " + "Only " + this.balance + " available." + " withdrawal not processed");
        }
        else {
            this.balance = this.balance - withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining Balance: " + this.balance);
        }
    }

}
