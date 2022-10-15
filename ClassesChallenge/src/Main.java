public class Main {

    public static void main(String[] args) {
        Account account = new Account("1234", 0.0, "Furkan", "furkanbaysan@hotmail.com",
                "531 470 09 25");
        // proof => System.out.println(account.getAccountNumber());

//        account.setAccountNumber("1234");
//        account.setCustomerName("Furkan");
//        account.setCustomerEmailAddress("furkanbaysan@hotmail.com");
//        account.setCustomerPhoneNumber("531 470 09 25");
//        account.setBalance(0.0);

        account.withdrawal(14500);
        //System.out.println("Balance: " + account.getBalance());
        account.deposit(2000);
        //System.out.println("Balance: " + account.getBalance());
        account.withdrawal(3000);

        account.deposit(1000);
        account.withdrawal(3000);

        System.out.println();
        System.out.println("\t" + "Constructor Challenge Solution");

        VipCustomer firstCustomer = new VipCustomer();
        System.out.println(firstCustomer.getName() + " " + firstCustomer.getCreditLimit() + " " + firstCustomer.getEmailAddress());

        VipCustomer secondCustomer = new VipCustomer("Anil", 100000.0);
        System.out.println(secondCustomer.getName() + " " + secondCustomer.getCreditLimit() + " " + secondCustomer.getEmailAddress());

        VipCustomer thirdCustomer = new VipCustomer("Furkan", 200000.0, "furkanbaysan@hotmail.com");
        System.out.println(thirdCustomer.getName() + " " + thirdCustomer.getCreditLimit() + " " + thirdCustomer.getEmailAddress());
    }
}
