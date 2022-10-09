public class Main {

    public static void main(String[] args) {
        Account account = new Account();

        account.setAccountNumber("1234");
        account.setCustomerName("Furkan");
        account.setCustomerEmailAddress("furkanbaysan@hotmail.com");
        account.setCustomerPhoneNumber("531 470 09 25");
        account.setBalance(0.0);

        account.withdrawal(14500);
        //System.out.println("Balance: " + account.getBalance());
        account.deposit(2000);
        //System.out.println("Balance: " + account.getBalance());
        account.withdrawal(3000);

        account.deposit(1000);
        account.withdrawal(3000);
    }
}
