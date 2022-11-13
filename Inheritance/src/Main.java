import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {

    public static void main(String[] args) {

        System.out.println("\t" + "Calculation of age from Date of Birth");
        Person person = new Person();

        LocalDate birthday = LocalDate.of(1997, Month.JULY, 23);
        person.setBirthDate(birthday);

        LocalDate today = LocalDate.now();

        Period period = Period.between(person.getBirthDate(), today);

        System.out.println(period.getYears() + " year" + " " +
                period.getMonths() + " month" + " " +
                period.getDays() + " day");

        System.out.println();

        System.out.println("\t" + "Inheritance");
        Engineer firstEngineer = new Engineer(9000);
        firstEngineer.setFirstName("Furkan");
        firstEngineer.setLastName("Baysan");

        Engineer secondEngineer = new Engineer(8000);
        secondEngineer.setFirstName("Velihan");
        secondEngineer.setLastName("Gozek");

        System.out.println(firstEngineer.getFirstName() + " " + firstEngineer.getLastName());
        System.out.println(secondEngineer.getFirstName() + " " + secondEngineer.getLastName());

        System.out.println();

        firstEngineer.setWeight(80);
        secondEngineer.setWeight(90);

        System.out.println("First Engineer Current Weight: " + firstEngineer.getWeight());
        System.out.println("Second Engineer Current Weight: " + secondEngineer.getWeight());

        firstEngineer.eating(10);
        secondEngineer.eating(20);

        System.out.println("First Engineer Current Weight: " + firstEngineer.getWeight());
        System.out.println("Second Engineer Current Weight: " + secondEngineer.getWeight());

        firstEngineer.running(20);
        secondEngineer.running(10);


        System.out.println("First Engineer Current Weight: " + firstEngineer.getWeight());
        System.out.println("Second Engineer Current Weight: " + secondEngineer.getWeight());

        System.out.println();

        LocalDate firstEngineerBirthday = LocalDate.of(1997, Month.JULY, 23);
        firstEngineer.setBirthDate(firstEngineerBirthday);

        LocalDate secondEngineerBirthday = LocalDate.of(1998, Month.MARCH, 8);
        secondEngineer.setBirthDate(secondEngineerBirthday);

        System.out.println("First Engineer Birthday: " + firstEngineer.getBirthDate());
        System.out.println("Second Engineer Birthday: " + secondEngineer.getBirthDate());

        System.out.println();

        System.out.println("\t" + "Subclass object special situations, not about inheritance");

        //firstEngineer.setSalary(9000);
        System.out.println(firstEngineer.getSalary());
        //secondEngineer.setSalary(8000);
        System.out.println(secondEngineer.getSalary());

        firstEngineer.raise(30);
        secondEngineer.raise(40);
        System.out.println("First Engineer Increased Salary: " + firstEngineer.getSalary());
        System.out.println("Second Engineer Increased Salary: " + secondEngineer.getSalary());

        System.out.println();

        System.out.println("\t" + "Halkbank.com.tr Scenario Implementation to understand Inheritance and Polymorphism");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        SendikaCustomer sendikaCustomer = new SendikaCustomer();

        //Inheritance

        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("1234");

        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("5678");

        sendikaCustomer.setId(3);
        sendikaCustomer.setCustomerNumber("9999");

        //Polymorphism

        CustomerManager customerManager = new CustomerManager();
        customerManager.add(individualCustomer);
        customerManager.add(corporateCustomer);
        customerManager.add(sendikaCustomer);
    }
}
